package com.bnq.scr.Role;

import com.bnq.scr.Entity.BaseEntityRepository;

import jakarta.transaction.Transactional;

public class RoleRepository extends BaseEntityRepository<Role>{

  @Transactional
  public Role create(String name, String description) {
    Role role = new Role();
    role.name = name;
    role.description = description;
    this.persist(role);
    return role;
  }

  @Transactional
  public Role findByName(String name) {
    return this.find("name = ?1", name).firstResult();
  }

  @Transactional
  public Role update(Role oldRole, Role newRole) {
    return oldRole;
  }

  // TODO override persiste for modifiedAt
}