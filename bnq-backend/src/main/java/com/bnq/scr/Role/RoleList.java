package com.bnq.scr.Role;

import java.util.AbstractList;

public class RoleList extends AbstractList<Role> {

  private Role[] roles;
  private int size;

  public RoleList() {
    this.size = 3;
    this.roles = new Role[this.size];

    this.roles[0] = new Role("Admin", "Admin");
    this.roles[1] = new Role("Mano", "Monsieur Mano");
    this.roles[2] = new Role("Eglantine", "Madame bibiche");
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public Role get(int id) {
    return this.roles[id];
  }
}
