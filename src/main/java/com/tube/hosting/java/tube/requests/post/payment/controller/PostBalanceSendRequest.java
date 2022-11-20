package com.tube.hosting.java.tube.requests.post.payment.controller;

import com.tube.hosting.java.tube.objects.payment.BalanceSendingRequestBody;
import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostBalanceSendRequest extends AbstractPostRequest<PlainMessage, BalanceSendingRequestBody> {

  public PostBalanceSendRequest(BalanceSendingRequestBody balanceSendingRequest) {
    super("payments/balance/send", PlainMessage.class, balanceSendingRequest);
  }
}
