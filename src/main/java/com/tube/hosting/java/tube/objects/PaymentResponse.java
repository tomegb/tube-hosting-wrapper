package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class PaymentResponse extends ResponsableObject {

  private final @NotNull String link;
  private final @NotNull String paymentMethodId;

  public PaymentResponse(@NotNull String link, @NotNull String paymentMethodId) {
    this.link = link;
    this.paymentMethodId = paymentMethodId;
  }

  @NotNull
  public String getLink() {
    return link;
  }

  @NotNull
  public String getPaymentMethodId() {
    return paymentMethodId;
  }
}
