package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import org.jetbrains.annotations.NotNull;

public class BalanceChargeRequestBody extends ResponsableObject {

  private final int amount;
  private final @NotNull PaymentOptions method;

  /**
   * @param amount Amount in cents and at least 300 cents (3 euros) must be charged
   * @param method Payment Method u choose
   */
  public BalanceChargeRequestBody(int amount, @NotNull PaymentOptions method) {
    this.amount = amount;
    this.method = method;
  }

  public int getAmount() {
    return amount;
  }

  @NotNull
  public PaymentOptions getMethod() {
    return method;
  }
}
