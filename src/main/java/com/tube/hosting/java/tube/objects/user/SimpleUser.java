package com.tube.hosting.java.tube.objects.user;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import com.tube.hosting.java.tube.objects.RoleTypes;

public class SimpleUser extends ResponsableObject {

  private final int id;
  private final String mail;
  private final String firstname;
  private final String lastname;
  private final RoleTypes role;

  public SimpleUser(int id, String mail, String firstname, String lastname, String role) {
    this.id = id;
    this.mail = mail;
    this.firstname = firstname;
    this.lastname = lastname;
    this.role = RoleTypes.valueOf(role);
  }

  public int getId() {
    return id;
  }

  public String getMail() {
    return mail;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public RoleTypes getRole() {
    return role;
  }
}
