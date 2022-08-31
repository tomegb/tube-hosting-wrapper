package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public enum PriceTypes {
  GROSS,
  NET,
  TAX_FREE;

  @NotNull
  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
