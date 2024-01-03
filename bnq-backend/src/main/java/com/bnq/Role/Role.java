package com.bnq.Role;

import java.util.List;

import com.bnq.Entity.BaseEntity;
import com.bnq.User.User;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import io.quarkus.security.jpa.RolesValue;

@Entity
public class Role extends BaseEntity {

  @RolesValue
  private String name;

  private String description;

  @ManyToMany()
  @JoinTable(
    name = "user_role",
    joinColumns = @JoinColumn(name = "role_id"),
    inverseJoinColumns = @JoinColumn(name = "user_id")
  )
  public List<User> users;

  public Role() {}

  public Role(String name, String description) {
    super();
    this.name = name;
    this.description = description;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
}
