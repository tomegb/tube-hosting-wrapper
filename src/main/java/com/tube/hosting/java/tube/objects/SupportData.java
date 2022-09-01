package com.tube.hosting.java.tube.objects;

public class SupportData extends ResponsableObject {

  private String discordName;
  private String skypeName;
  private String phoneNumber;

  public SupportData(String discordName, String skypeName, String phoneNumber) {
    this.discordName = discordName;
    this.skypeName = skypeName;
    this.phoneNumber = phoneNumber;
  }

  public String getDiscordName() {
    return discordName;
  }

  public String getSkypeName() {
    return skypeName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setDiscordName(String discordName) {
    this.discordName = discordName;
  }

  public void setSkypeName(String skypeName) {
    this.skypeName = skypeName;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
