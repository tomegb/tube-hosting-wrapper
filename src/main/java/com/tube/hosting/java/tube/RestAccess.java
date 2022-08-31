package com.tube.hosting.java.tube;

import okhttp3.OkHttpClient;

public class RestAccess {

  private final String email;
  private final String password;
  private final OkHttpClient client;

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
  }
}
