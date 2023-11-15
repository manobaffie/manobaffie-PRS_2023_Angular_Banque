package com.bnq.scr.User;

import com.bnq.scr.Token.Token;
import com.bnq.scr.User.Dtos.CreatedUserDto;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class UserService extends UserRepository {

  @Inject
  UserRepository userRepository;

  @Transactional
  public CreatedUserDto creatUser(String username, String password) {
    User user = this.userRepository.create(username, password);

    Token jwt = new Token(user);

    CreatedUserDto cretedUser = new CreatedUserDto();
    cretedUser.username = user.username;
    cretedUser.token = jwt.get();
    return cretedUser;
  }
}
