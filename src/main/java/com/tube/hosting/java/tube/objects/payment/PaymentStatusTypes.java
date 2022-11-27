package com.tube.hosting.java.tube.objects.payment;

import org.jetbrains.annotations.NotNull;

public enum PaymentStatusTypes {

  STARTED, PAID, CANCELLED, REFUNDED;

  @NotNull
  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
