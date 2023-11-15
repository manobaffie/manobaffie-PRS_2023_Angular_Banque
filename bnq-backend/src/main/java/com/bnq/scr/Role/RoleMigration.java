package com.bnq.scr.Role;

import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;

@Startup
public class RoleMigration extends RoleRepository {
  @Transactional
  void onStart(@Observes StartupEvent ev) {
    RoleList roleList = new RoleList();

    for(Role newRole : roleList) {
      Role role = this.findByName(newRole.name);
      if(role == null) {
        this.persist(newRole);
      } else if (!newRole.equals(role)) {
      }
    }
  }
}
