package com.tube.hosting.java.tube.requests.get.payment.controller;

import com.tube.hosting.java.tube.objects.payment.SearchResultBalanceChange;
import com.tube.hosting.java.tube.requests.AbstractGetRequest;

public class GetPaymentRequest extends AbstractGetRequest<SearchResultBalanceChange> {

  public GetPaymentRequest() {
    super("payments/balance", SearchResultBalanceChange.class);
  }
}
