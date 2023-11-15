package com.bnq.scr.Role;

import java.util.List;

import com.bnq.scr.Entity.BaseEntity;
import com.bnq.scr.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import io.quarkus.security.jpa.RolesValue;

@Entity
public class Role extends BaseEntity {

  @RolesValue
  public String name;

  public String description;

  @ManyToMany()
  @JoinTable(
    name = "user_role",
    joinColumns = @JoinColumn(name = "role_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id")
  )
  public List<User> users;

  public Role() {
    super();
  }

  public Role(String name, String description) {
    super();
    this.name = name;
    this.description = description;
  }
}
