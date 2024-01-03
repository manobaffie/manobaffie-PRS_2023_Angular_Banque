package com.bnq.User;

import com.bnq.Entity.BaseEntityList;

public class UserList extends BaseEntityList<User> {
  public UserList() {
    this.entity.add(new User("Admin", "toor"));
    this.entity.add(new User("Mano", "toor"));
    this.entity.add(new User("Eglantine", "toor"));
  }
}
