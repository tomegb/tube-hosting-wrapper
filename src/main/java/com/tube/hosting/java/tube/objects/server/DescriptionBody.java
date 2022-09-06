package com.tube.hosting.java.tube.objects.server;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import org.jetbrains.annotations.NotNull;

public class DescriptionBody extends ResponsableObject {

  private final @NotNull String description;

  public DescriptionBody(@NotNull String description) {
    this.description = description;
  }

  @NotNull
  public String getDescription() {
    return description;
  }
}
