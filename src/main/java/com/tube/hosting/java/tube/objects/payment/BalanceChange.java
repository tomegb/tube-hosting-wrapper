package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import com.tube.hosting.java.tube.objects.user.SimpleUser;

public class BalanceChange extends ResponsableObject {

  private final int id;
  private final int amount;
  private final int startBalance;
  private final String time;
  private final String type;
  private final String description;
  private final int userId;
  private final int paymentBundleId;
  private final boolean successful;
  private final SimpleUser other;

  public BalanceChange(int id, int amount, int startBalance, String time, String type, String description, int userId,
      int paymentBundleId, boolean successful, SimpleUser other) {
    this.id = id;
    this.amount = amount;
    this.startBalance = startBalance;
    this.time = time;
    this.type = type;
    this.description = description;
    this.userId = userId;
    this.paymentBundleId = paymentBundleId;
    this.successful = successful;
    this.other = other;
  }

  public int getId() {
    return id;
  }

  public int getAmount() {
    return amount;
  }

  public int getStartBalance() {
    return startBalance;
  }

  public String getTime() {
    return time;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public int getUserId() {
    return userId;
  }

  public int getPaymentBundleId() {
    return paymentBundleId;
  }

  public boolean isSuccessful() {
    return successful;
  }

  public SimpleUser getOther() {
    return other;
  }
}
