package com.tube.hosting.java.tube.objects.server;

import org.jetbrains.annotations.NotNull;

public enum CPUBrand {
  INTEL, AMD;

  @NotNull
  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
