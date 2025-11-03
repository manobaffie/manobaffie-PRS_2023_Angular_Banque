package com.bnq.Entity;

import com.bnq.Token.TokenService;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BaseEntityRessource {
  @Inject
  TokenService tokenService;

  public BaseEntityRessource() {
    tokenService.claim(null, tokenService);
  }
}
