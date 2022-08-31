package com.tube.hosting.java.tube.objects;

import com.google.gson.JsonObject;

public enum Locale {

  DE, EN;

  @Override
  public String toString() {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("locale", name().toUpperCase());
    return jsonObject.toString();
  }
}
