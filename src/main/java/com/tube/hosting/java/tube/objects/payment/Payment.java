package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class Payment extends ResponsableObject {

  private final int id;
  private final PaymentOptions method;
  private final int amount;
  private final String description;
  private final String timeStarted;
  private final String timeFinished;
  private final String providerId;
  private final PaymentType type;
  private final int paymentBundleId;
  private final int userId;

  public Payment(int id, PaymentOptions method, int amount, String description, String timeStarted, String timeFinished,
      String providerId, PaymentType type, int paymentBundleId, int userId) {
    this.id = id;
    this.method = method;
    this.amount = amount;
    this.description = description;
    this.timeStarted = timeStarted;
    this.timeFinished = timeFinished;
    this.providerId = providerId;
    this.type = type;
    this.paymentBundleId = paymentBundleId;
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public PaymentOptions getMethod() {
    return method;
  }

  public int getAmount() {
    return amount;
  }

  public String getDescription() {
    return description;
  }

  public String getTimeStarted() {
    return timeStarted;
  }

  public String getTimeFinished() {
    return timeFinished;
  }

  public String getProviderId() {
    return providerId;
  }

  public PaymentType getType() {
    return type;
  }

  public int getPaymentBundleId() {
    return paymentBundleId;
  }

  public int getUserId() {
    return userId;
  }
}
