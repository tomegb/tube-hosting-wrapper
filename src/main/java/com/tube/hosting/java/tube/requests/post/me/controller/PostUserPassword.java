package com.tube.hosting.java.tube.requests.post.me.controller;

import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.objects.user.UserChangePasswordObject;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostUserPassword extends AbstractPostRequest<PlainMessage, UserChangePasswordObject> {

  public PostUserPassword(UserChangePasswordObject passwordChange) {
    super("me/password", PlainMessage.class, passwordChange);
  }
}
