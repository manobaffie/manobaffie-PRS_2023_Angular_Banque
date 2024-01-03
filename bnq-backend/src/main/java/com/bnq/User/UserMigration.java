package com.bnq.User;

import com.bnq.Entity.EntityMigration;

import io.quarkus.runtime.Startup;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Startup
@ApplicationScoped
public class UserMigration {  
  @Inject
  UserRepository userRepository;

  @Transactional
  public void onStart(@Observes StartupEvent ev) {
    EntityMigration<User, UserRepository> entityMigration = new EntityMigration<User, UserRepository>(new UserList(), userRepository);
    entityMigration.migrate();
  }
}
