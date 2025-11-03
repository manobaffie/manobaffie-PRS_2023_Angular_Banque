package com.bnq.User;

import com.bnq.Entity.BaseEntityRessource;
import com.bnq.User.Dtos.CreateUserDto;
import com.bnq.User.Dtos.CreatedUserDto;

import jakarta.inject.Inject;
import jakarta.validation.Valid;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/user")
public class UserResource extends BaseEntityRessource {
  @Inject
  UserService userService;

  public UserResource() {
    super();
  }

  @POST
  public CreatedUserDto creatUser(
    @Valid CreateUserDto createUser
  ) {
    return this.userService.creatUser(
      createUser.username,
      createUser.password
    );
  }

  @GET
  @Path("/test")
  public void test() {
  }
}
