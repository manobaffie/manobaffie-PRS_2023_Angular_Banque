package com.bnq.scr.User.Dtos;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection()
public class CreatedUserDto {
  public String username;
  public String token;
}
