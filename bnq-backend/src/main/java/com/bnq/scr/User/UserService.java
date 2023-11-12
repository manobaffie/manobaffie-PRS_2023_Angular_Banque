package com.bnq.scr.User;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserService extends UserRepository {

  @Transactional
  public void test() {
    User test = new User();
    test.name = "mano";
    test.persist();
  }
}
