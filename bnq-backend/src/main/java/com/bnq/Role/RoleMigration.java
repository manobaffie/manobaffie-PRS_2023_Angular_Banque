package com.bnq.Role;

import com.bnq.Entity.EntityMigration;

import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Startup
@ApplicationScoped
public class RoleMigration {
  @Inject
  RoleRepository roleRepository;

  @Transactional
  public void onStart(@Observes StartupEvent ev) {
    EntityMigration<Role, RoleRepository> entityMigration = new EntityMigration<Role, RoleRepository>(new RoleList(), roleRepository);
    entityMigration.migrate();
  }
}
