package com.bnq.User.Dtos;

import com.bnq.Entity.BaseEntityDto;
import com.bnq.User.User;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class CreatedUserDto extends BaseEntityDto {
  public CreatedUserDto(User user) {
    super(user);
  }

  public String username;
}
