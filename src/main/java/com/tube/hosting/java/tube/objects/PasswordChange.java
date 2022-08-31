package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class PasswordChange extends ResponsableObject {

  private final @NotNull String password;

  public PasswordChange(@NotNull String password) {
    this.password = password;
  }

  @NotNull
  public String getPassword() {
    return password;
  }
}
