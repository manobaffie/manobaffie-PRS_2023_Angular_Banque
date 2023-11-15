package com.bnq.scr.Token;

import java.time.Instant;
import java.time.temporal.TemporalUnit;

import com.bnq.scr.User.User;

import io.smallrye.jwt.build.Jwt;
import io.smallrye.jwt.build.JwtClaimsBuilder;

public class Token {
  final private String issuer = "http://localhost:8080";

  private JwtClaimsBuilder builder;

  public Token() {

  }

  public Token(User user) {
    this.builder = Jwt.claims();
    this.builder.upn(user.username);
    this.builder.issuer(this.issuer);
    this.builder.claim("roles", user.getRoles());
  }

  public String get() {
    return this.builder.sign();
  }

  public void add(String key, Object data) {
    this.builder.claim(key, data);
  }

  public void subject(String subject) {
    this.builder.subject(subject);
  }

  public void expirationTime(long amountToAdd, TemporalUnit unit) {
    this.builder.expiresAt(Instant.now().plus(amountToAdd, unit));
  }

}
