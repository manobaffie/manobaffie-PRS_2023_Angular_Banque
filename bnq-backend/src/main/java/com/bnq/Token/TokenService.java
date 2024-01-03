package com.bnq.Token;

import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.HashSet;

import com.bnq.User.User;
import com.bnq.User.UserRepository;

import io.smallrye.jwt.build.Jwt;
import io.smallrye.jwt.build.JwtClaimsBuilder;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class TokenService {
  private JwtClaimsBuilder builder;

  @Inject
  UserRepository userRepository;

  public void build(User user) {
    this.builder = Jwt.claims();
    this.builder.issuer("https://localhost:8080/issuer");
    this.builder.upn(user.getName());
    this.builder.groups(new HashSet<>(userRepository.getRoles(user)));
  }

  public String sign() {
    return this.builder.sign();
  }

  public void claim(String key, Object data) {
    this.builder.claim(key, data);
  }

  public void subject(String subject) {
    this.builder.subject(subject);
  }

  public void expirationTime(long amountToAdd, TemporalUnit unit) {
    this.builder.expiresAt(Instant.now().plus(amountToAdd, unit));
  }
}
