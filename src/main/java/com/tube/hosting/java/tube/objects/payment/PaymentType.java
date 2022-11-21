package com.tube.hosting.java.tube.objects.payment;

import org.jetbrains.annotations.NotNull;

public enum PaymentType {

  BALANCE_CHANGE, PAYMENT;

  @NotNull
  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
