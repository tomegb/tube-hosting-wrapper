package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.Nullable;

public class SupportData extends ResponsableObject {

  private @Nullable String discordName;
  private @Nullable String skypeName;
  private @Nullable String phoneNumber;

  public SupportData(@Nullable String discordName, @Nullable String skypeName, @Nullable String phoneNumber) {
    this.discordName = discordName;
    this.skypeName = skypeName;
    this.phoneNumber = phoneNumber;
  }

  @Nullable
  public String getDiscordName() {
    return discordName;
  }

  @Nullable
  public String getSkypeName() {
    return skypeName;
  }

  @Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setDiscordName(@Nullable String discordName) {
    this.discordName = discordName;
  }

  public void setSkypeName(@Nullable String skypeName) {
    this.skypeName = skypeName;
  }

  public void setPhoneNumber(@Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
