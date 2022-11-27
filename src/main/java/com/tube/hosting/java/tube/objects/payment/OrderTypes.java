package com.tube.hosting.java.tube.objects.payment;

import org.jetbrains.annotations.NotNull;

public enum OrderTypes {

  STANDARD, ORDER, RENEWAL, UPGRADE;

  @NotNull
  @Override
  public String toString() {
    return name().toLowerCase();
  }

}
