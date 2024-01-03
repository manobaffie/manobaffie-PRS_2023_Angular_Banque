package com.bnq.User;

import com.bnq.Token.TokenService;
import com.bnq.User.Dtos.CreatedUserDto;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {

  @Inject
  UserRepository userRepository;

  @Inject
  TokenService tokenService;

  public CreatedUserDto creatUser(String username, String password) {
    if (this.userRepository.findByName(username) != null) {
      throw new RuntimeException("the username already exist");
    }

    User user = this.userRepository.create(username, password);

    this.tokenService.build(user);

    CreatedUserDto cretedUser = new CreatedUserDto();
    cretedUser.username = user.getName();
    cretedUser.token = this.tokenService.sign();

    return cretedUser;
  }
}
