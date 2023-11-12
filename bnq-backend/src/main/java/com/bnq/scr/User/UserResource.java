package com.bnq.scr.User;

import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/user")
public class UserResource {

  @Inject UserService userService; 

  @GET
  @Produces("text/plain")
  public String test() {

    this.userService.test();

    return "test";
  }
}
