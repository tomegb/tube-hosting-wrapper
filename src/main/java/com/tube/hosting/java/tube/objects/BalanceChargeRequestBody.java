package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class BalanceChargeRequestBody extends ResponsableObject {

  private final int amount;
  private final @NotNull String method;

  public BalanceChargeRequestBody(int amount, @NotNull String method) {
    this.amount = amount;
    this.method = method;
  }

  public int getAmount() {
    return amount;
  }

  @NotNull
  public String getMethod() {
    return method;
  }
}
