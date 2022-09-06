package com.tube.hosting.java.tube.requests.get.me.controller;

import com.tube.hosting.java.tube.objects.user.User;
import com.tube.hosting.java.tube.requests.AbstractGetRequest;

public class GetUserRequest extends AbstractGetRequest<User> {

  public GetUserRequest() {
    super("me", User.class);
  }

}
