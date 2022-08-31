package com.tube.hosting.java.tube.objects;

public class UserPaymentInfo extends ResponsableObject {

  private final int id;
  private final String vatNumber;
  private final boolean reverseCharge;
  private final String startDate;
  private final PriceTypes priceType;

  public UserPaymentInfo(int id, String vatNumber, boolean reverseCharge, String startDate, PriceTypes priceType) {
    this.id = id;
    this.vatNumber = vatNumber;
    this.reverseCharge = reverseCharge;
    this.startDate = startDate;
    this.priceType = priceType;
  }

  public int getId() {
    return id;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public boolean isReverseCharge() {
    return reverseCharge;
  }

  public String getStartDate() {
    return startDate;
  }

  public PriceTypes getPriceType() {
    return priceType;
  }
}

