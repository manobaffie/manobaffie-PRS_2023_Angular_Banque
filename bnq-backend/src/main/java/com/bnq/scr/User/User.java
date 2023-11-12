package com.bnq.scr.User;

import com.bnq.scr.Entity.BaseEntity;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseEntity {
  public String name;

  public User() {
    super();
  }
}
