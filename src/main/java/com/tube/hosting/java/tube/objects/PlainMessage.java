package com.tube.hosting.java.tube.objects;

public class PlainMessage extends ResponsableObject {

  private final String message;

  public PlainMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
