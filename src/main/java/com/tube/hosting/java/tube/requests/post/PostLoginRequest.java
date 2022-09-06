package com.tube.hosting.java.tube.requests.post;

import com.tube.hosting.java.tube.RestAccess;
import com.tube.hosting.java.tube.objects.user.JWTTokenResponse;
import com.tube.hosting.java.tube.objects.user.LoginBody;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;
import org.jetbrains.annotations.NotNull;

public class PostLoginRequest extends AbstractPostRequest<JWTTokenResponse, LoginBody> {

  public PostLoginRequest(String mail, String password) {
    this(new LoginBody(mail, password));
  }

  public PostLoginRequest(LoginBody requestBody) {
    super("login", JWTTokenResponse.class, requestBody);
  }

  @Override
  public void executeRequest(@NotNull RestAccess restAccess) {
    super.executeRequest(restAccess);
    restAccess.setToken(getResponseObject().getToken());
  }
}
