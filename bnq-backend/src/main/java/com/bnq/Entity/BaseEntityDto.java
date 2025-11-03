package com.bnq.Entity;

import com.bnq.User.User;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class BaseEntityDto {

  public BaseEntityDto(User user) {

  }

  public String token;
}
