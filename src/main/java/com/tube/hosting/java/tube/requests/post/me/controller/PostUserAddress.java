package com.tube.hosting.java.tube.requests.post.me.controller;

import com.tube.hosting.java.tube.objects.Address;
import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostUserAddress extends AbstractPostRequest<PlainMessage, Address> {

  public PostUserAddress(Address address) {
    super("me/address", PlainMessage.class, address);
  }

}
