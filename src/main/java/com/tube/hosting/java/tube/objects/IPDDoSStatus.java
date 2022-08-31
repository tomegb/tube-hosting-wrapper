package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public record IPDDoSStatus(@NotNull Layer4 layer4, @NotNull Layer7 layer7) {

  public enum Layer4 {
    DYNAMIC,
    PERMANENT;

    @NotNull
    @Override
    public String toString() {
      return name().toLowerCase();
    }
  }

  public enum Layer7 {
    OFF,
    PERMANENT,
    ONLY;

    @NotNull
    @Override
    public String toString() {
      return name().toLowerCase();
    }
  }

}
