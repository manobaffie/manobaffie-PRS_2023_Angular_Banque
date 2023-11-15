package com.bnq.scr.User;

import java.util.List;

import com.bnq.scr.Entity.BaseEntity;
import com.bnq.scr.Role.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;

@Entity
@UserDefinition
public class User extends BaseEntity {
  @Username
  public String username;
  @Password
  public String password;

  @Roles
  @ManyToMany()
  @JoinTable(
    name = "user_role",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  public List<Role> roles;

  public User() {
    super();
  }

  public String getRoles() {
    return String.join(",", this.roles.stream().map(it -> it.name).toList());
  }
}
