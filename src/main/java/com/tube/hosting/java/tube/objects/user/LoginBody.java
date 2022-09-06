package com.tube.hosting.java.tube.objects.user;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import org.jetbrains.annotations.NotNull;

public class LoginBody extends ResponsableObject {

  private final @NotNull String mail;
  private final @NotNull String password;

  public LoginBody(@NotNull String mail, @NotNull String password) {
    this.mail = mail;
    this.password = password;
  }

  @NotNull
  public String getMail() {
    return mail;
  }

  @NotNull
  public String getPassword() {
    return password;
  }
}
