package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class IPDDoSStatus extends ResponsableObject {

  private final @NotNull Layer4 layer4;
  private final @NotNull Layer7 layer7;

  public IPDDoSStatus(@NotNull Layer4 layer4, @NotNull Layer7 layer7) {
    this.layer4 = layer4;
    this.layer7 = layer7;
  }

  @NotNull
  public Layer4 getLayer4() {
    return layer4;
  }

  @NotNull
  public Layer7 getLayer7() {
    return layer7;
  }

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
