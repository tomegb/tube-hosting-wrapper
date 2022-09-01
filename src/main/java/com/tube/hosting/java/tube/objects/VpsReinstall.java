package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class VpsReinstall extends ResponsableObject {

  private final @NotNull String password;
  private final @NotNull String hostname;

  public VpsReinstall(@NotNull String password, @NotNull String hostname) {
    this.password = password;
    this.hostname = hostname;
  }

  @NotNull
  public String getPassword() {
    return password;
  }

  @NotNull
  public String getHostname() {
    return hostname;
  }
}
