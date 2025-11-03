package com.bnq.Role;

import com.bnq.Entity.BaseEntityRepositoryMigratable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

@RequestScoped
public class RoleRepository implements BaseEntityRepositoryMigratable<Role> {
  @Transactional
  public Role create(String name, String description) {
    Role role = new Role(name, description);
    this.persist(role);
    return role;
  }

  @Transactional
  public Role findByName(String name) {
    return this.find("name = ?1", name).firstResult();
  }

  @Override
  public Role findForMigration(Role entity) {
    return this.findByName(entity.getName());
  }

  @Override
  public Boolean isEqual(Role role1, Role role2) {
    return role1.getName() == role2.getName() && role1.getDescription() == role2.getDescription();
  }

  @Transactional
  public Role update(Role roleToUpdate, Role role) {
    roleToUpdate.setName(role.getName());
    roleToUpdate.setDescription(role.getDescription());
    this.getEntityManager().merge(roleToUpdate);
    return roleToUpdate;
  }
}
