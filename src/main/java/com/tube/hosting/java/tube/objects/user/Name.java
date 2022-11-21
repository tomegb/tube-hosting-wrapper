package com.tube.hosting.java.tube.objects.user;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class Name extends ResponsableObject {

  private final String firstName;
  private final String lastName;

  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}
