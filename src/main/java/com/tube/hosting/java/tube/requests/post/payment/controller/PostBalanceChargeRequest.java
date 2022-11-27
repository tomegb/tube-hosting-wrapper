package com.tube.hosting.java.tube.requests.post.payment.controller;

import com.tube.hosting.java.tube.objects.payment.BalanceChargeRequestBody;
import com.tube.hosting.java.tube.objects.payment.PaymentResponse;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostBalanceChargeRequest extends AbstractPostRequest<PaymentResponse, BalanceChargeRequestBody> {

  public PostBalanceChargeRequest(BalanceChargeRequestBody requestBody) {
    super("payments/balance/charge", PaymentResponse.class, requestBody);
  }
}
