package com.tube.hosting.java.tube.requests.post;

import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.objects.User;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostUserNames extends AbstractPostRequest<PlainMessage, User> {

  public PostUserNames(User changedUserObject) {
    super("me/names", PlainMessage.class, changedUserObject);
  }

}
