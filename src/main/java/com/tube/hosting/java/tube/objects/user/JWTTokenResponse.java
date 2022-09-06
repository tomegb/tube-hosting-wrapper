package com.tube.hosting.java.tube.objects.user;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import com.tube.hosting.java.tube.objects.user.User;

public class JWTTokenResponse extends ResponsableObject {

  private final String token;
  private final User userData;

  public JWTTokenResponse(String token, User userData) {
    this.token = token;
    this.userData = userData;
  }

  public String getToken() {
    return token;
  }

  public User getUserData() {
    return userData;
  }

}
