package com.tube.hosting.java.tube.objects;

public class UserChangePasswordObject extends ResponsableObject {

  private final String password;
  private final String oldPassword;

  public UserChangePasswordObject(String password, String oldPassword) {
    this.password = password;
    this.oldPassword = oldPassword;
  }

  public String getPassword() {
    return password;
  }

  public String getOldPassword() {
    return oldPassword;
  }
}
