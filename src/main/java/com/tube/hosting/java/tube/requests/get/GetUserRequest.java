package com.tube.hosting.java.tube.requests.get;

import com.tube.hosting.java.tube.objects.User;
import com.tube.hosting.java.tube.requests.AbstractGetRequest;

public class GetUserRequest extends AbstractGetRequest<User> {

  public GetUserRequest() {
    super("me", User.class);
  }

}
