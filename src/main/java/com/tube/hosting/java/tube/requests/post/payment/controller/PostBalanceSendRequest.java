package com.tube.hosting.java.tube.requests.post.payment.controller;

import com.tube.hosting.java.tube.objects.BalanceSendingRequestBody;
import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostBalanceSendRequest extends AbstractPostRequest<PlainMessage, BalanceSendingRequestBody> {

  protected PostBalanceSendRequest(BalanceSendingRequestBody balanceSendingRequest) {
    super("payments/balance/send", PlainMessage.class, balanceSendingRequest);
  }
}
