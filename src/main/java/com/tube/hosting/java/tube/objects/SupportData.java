package com.tube.hosting.java.tube.objects;

public class SupportData extends ResponsableObject {

  private final String discordName;
  private final String skypeName;
  private final String phoneNumber;

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
}
