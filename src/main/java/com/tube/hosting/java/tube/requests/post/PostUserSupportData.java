package com.tube.hosting.java.tube.requests.post;

import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.objects.SupportData;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostUserSupportData extends AbstractPostRequest<PlainMessage, SupportData> {

  public PostUserSupportData(SupportData supportData) {
    super("me/supportData", PlainMessage.class, supportData);
  }
}
