package com.bnq.User;

import java.util.List;

import com.bnq.Entity.BaseEntityRepositoryMigratable;
import com.bnq.Role.Role;
import com.bnq.Role.RoleRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserRepository implements BaseEntityRepositoryMigratable<User> {

  @Inject
  RoleRepository roleRepository;

  @Transactional
  public User create(String username, String password) {
    User user = new User(username, password);
    user.addRole(this.roleRepository.findByName("User"));
    this.persist(user);
    return user;
  }

  @Transactional
  public User findByName(String username) {
    return this.find("name = ?1", username).firstResult();
  }

  public List<String> getRoles(User user) {
    return user.getRoles().stream().map(role -> role.getName()).toList();
  }

  @Override
  public Boolean isEqual(User user1, User user2) {
    if (user1.getName() != user2.getName() || user1.getRoles().size() != user2.getRoles().size()) {
      return false;
    }
    for (int i = 0; i < user1.getRoles().size(); i++) {
      if (!roleRepository.isEqual(user1.getRoles().get(i), user2.getRoles().get(i))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public User update(User userToUpdate, User user) {
    userToUpdate.setName(user.getName());
    userToUpdate.setRoles(user.getRoles());
    userToUpdate.setPassword(user.getPassword());
    this.getEntityManager().merge(userToUpdate);
    return userToUpdate;
  }

  @Override
  public User findForMigration(User entity) {
    return this.findByName(entity.getName());
  }
}
