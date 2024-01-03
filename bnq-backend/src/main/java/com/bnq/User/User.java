package com.bnq.User;

import java.util.ArrayList;
import java.util.List;

import com.bnq.Entity.BaseEntity;
import com.bnq.Role.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;

@Entity
@UserDefinition
public class User extends BaseEntity {
  @Username
  private String name;
  @Password
  private String password;

  @Roles
  @ManyToMany()
  @JoinTable(
    name = "user_role",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id")
  )
  private List<Role> roles;

  public User() {}
  public User(String username, String password) {
    this.name = username;
    this.password = BcryptUtil.bcryptHash(password);
    this.roles = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return this.password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public List<Role> getRoles() {
    return this.roles;
  }
  public void addRole(Role role) {
    this.roles.add(role);
  }
  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }
}
