package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public enum PaymentOptions {

  MANUALLY, PAYSAFECARD, CREDITCARD, PAYPAL, SOFORT, GIROPAY, BANKTRANSFER;

  @NotNull
  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
