package com.bnq.Token;

import org.eclipse.microprofile.jwt.JsonWebToken;

import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@TokenManager
@Priority(Interceptor.Priority.APPLICATION)
public class TokenInterceptor {

  @Inject
  JsonWebToken jwt;

  @AroundInvoke
  public Object checkToken(InvocationContext context) throws Exception {
    System.out.println("context.toString() : " + context.toString());
    // Token jwt = new Token();

    return context.proceed();
  }
}
