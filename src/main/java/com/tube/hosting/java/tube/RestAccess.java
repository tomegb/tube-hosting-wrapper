package com.tube.hosting.java.tube;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class RestAccess {

  private static final long TOKEN_CACHE_MILLIS = TimeUnit.HOURS.toMillis(1);

  private final String email;
  private final String password;
  private final OkHttpClient client;

  private long lastTokenUpdate = 0L;
  private String token;

  public RestAccess(String mail, String password) {
    this(mail, password, new OkHttpClient());
  }

  public RestAccess(String mail, String password, OkHttpClient client) {
    this.email = mail;
    this.password = password;
    this.client = client;
  }

  public OkHttpClient getClient() {
    return client;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
    lastTokenUpdate = System.currentTimeMillis();
  }

  public boolean updateRequired() {
    return lastTokenUpdate > System.currentTimeMillis() + TOKEN_CACHE_MILLIS;
  }
}
