package com.bnq.Role;

import com.bnq.Entity.BaseEntityList;

public class RoleList extends BaseEntityList<Role> {
  public RoleList() {
    this.entity.add(new Role("Admin", "Admin"));

    this.entity.add(new Role("Mano", "Monsieur Mano"));
    this.entity.add(new Role("Eglantine", "Madame bibiche"));

    this.entity.add(new Role("User", "single user"));
  }
}
