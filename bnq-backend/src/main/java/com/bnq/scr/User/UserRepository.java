package com.bnq.scr.User;

import com.bnq.scr.Entity.BaseEntityRepository;

import io.quarkus.elytron.security.common.BcryptUtil;

public class UserRepository extends BaseEntityRepository<User> {

  public User create(
    String username,
    String password
  ) {
    User user = new User();
    user.username = username;
    user.password = BcryptUtil.bcryptHash(password);
    this.persist(user);
    return user;
  }
}
