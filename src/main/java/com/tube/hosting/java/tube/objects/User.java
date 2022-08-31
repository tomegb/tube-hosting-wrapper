package com.tube.hosting.java.tube.objects;

import com.google.gson.annotations.SerializedName;

public class User extends ResponsableObject {

  private final int id;
  private final int balance;
  private final String mail;
  private final Locale locale;
  private final RoleTypes role;
  private final boolean enabled;
  @SerializedName("lastip")
  private final String lastIp;
  private final String regDate;
  private final boolean verified;
  private final Address address;
  private final boolean debuggingEnabled;
  private final UserPaymentInfo paymentInfo;
  private final String[] ipWhitelist;
  private final PriceTypes priceType;
  @SerializedName("firstname")
  private final String firstName;
  @SerializedName("lastname")
  private final String lastName;
  private final SupportData supportData;

  public User(int id, int balance, String mail, Locale locale, RoleTypes role, boolean enabled, String lastIp,
      String regDate, boolean verified, Address address, boolean debuggingEnabled, UserPaymentInfo paymentInfo,
      String[] ipWhitelist, PriceTypes priceType, String firstName, String lastName, SupportData supportData) {
    this.id = id;
    this.balance = balance;
    this.mail = mail;
    this.locale = locale;
    this.role = role;
    this.enabled = enabled;
    this.lastIp = lastIp;
    this.regDate = regDate;
    this.verified = verified;
    this.address = address;
    this.debuggingEnabled = debuggingEnabled;
    this.paymentInfo = paymentInfo;
    this.ipWhitelist = ipWhitelist;
    this.priceType = priceType;
    this.firstName = firstName;
    this.lastName = lastName;
    this.supportData = supportData;
  }

  public int getId() {
    return id;
  }

  public int getBalance() {
    return balance;
  }

  public String getMail() {
    return mail;
  }

  public Locale getLocale() {
    return locale;
  }

  public RoleTypes getRole() {
    return role;
  }

  public boolean isEnabled() {
    return enabled;
  }

  public String getLastIp() {
    return lastIp;
  }

  public String getRegDate() {
    return regDate;
  }

  public boolean isVerified() {
    return verified;
  }

  public Address getAddress() {
    return address;
  }

  public boolean isDebuggingEnabled() {
    return debuggingEnabled;
  }

  public UserPaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  public String[] getIpWhitelist() {
    return ipWhitelist;
  }

  public PriceTypes getPriceType() {
    return priceType;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public SupportData getSupportData() {
    return supportData;
  }
}
