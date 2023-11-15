package com.bnq.scr.User.Dtos;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.validation.constraints.NotBlank;

@RegisterForReflection()
public class CreateUserDto {

  @NotBlank(message="username may not be blank")
  public String username;

  @NotBlank(message="password may not be blank")
  public String password;
}
