package com.bnq.User;

import org.eclipse.microprofile.jwt.JsonWebToken;

import com.bnq.Role.RoleRepository;
import com.bnq.Token.TokenManager;
import com.bnq.User.Dtos.CreateUserDto;
import com.bnq.User.Dtos.CreatedUserDto;

import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
// @TokenManager
public class UserResource {
  @Inject
  UserService userService;

  @Inject
  RoleRepository roleRepository;

  @POST
  @PermitAll
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
  // @RolesAllowed({ "User" })
  @PermitAll
  public void test() {
  }
}
