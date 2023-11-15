package com.bnq.scr.User;

import com.bnq.scr.User.Dtos.CreateUserDto;
import com.bnq.scr.User.Dtos.CreatedUserDto;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

  @Inject UserService userService;

  @POST
  public CreatedUserDto creatUser(
    @Valid CreateUserDto createUser
  ) {
    return this.userService.creatUser(
      createUser.username,
      createUser.password
    );
  }
}
