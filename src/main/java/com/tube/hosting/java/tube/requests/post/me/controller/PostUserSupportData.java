package com.tube.hosting.java.tube.requests.post.me.controller;

import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.objects.user.SupportData;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostUserSupportData extends AbstractPostRequest<PlainMessage, SupportData> {

  public PostUserSupportData(SupportData supportData) {
    super("me/supportData", PlainMessage.class, supportData);
  }
}
