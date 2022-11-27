package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import com.tube.hosting.java.tube.objects.user.Address;
import com.tube.hosting.java.tube.objects.user.Name;

public class Invoice extends ResponsableObject {

  private final Address address;
  private final UserPaymentInfo paymentInfo;
  private final Name name;
  private final int id;
  private final int userId;
  private final String oldInvoiceId;
  private final InvoiceItem[] items;
  private final String time;
  private final PriceTypes priceType;
  private final boolean finished;
  private final int paymentBundleId;
  private final String taxPercentFormatted;

  public Invoice(Address address, UserPaymentInfo paymentInfo, Name name, int id, int userId, String oldInvoiceId,
      InvoiceItem[] items, String time, PriceTypes priceType, boolean finished, int paymentBundleId,
      String taxPercentFormatted) {
    this.address = address;
    this.paymentInfo = paymentInfo;
    this.name = name;
    this.id = id;
    this.userId = userId;
    this.oldInvoiceId = oldInvoiceId;
    this.items = items;
    this.time = time;
    this.priceType = priceType;
    this.finished = finished;
    this.paymentBundleId = paymentBundleId;
    this.taxPercentFormatted = taxPercentFormatted;
  }

  public Address getAddress() {
    return address;
  }

  public UserPaymentInfo getPaymentInfo() {
    return paymentInfo;
  }

  public Name getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getUserId() {
    return userId;
  }

  public String getOldInvoiceId() {
    return oldInvoiceId;
  }

  public InvoiceItem[] getItems() {
    return items;
  }

  public String getTime() {
    return time;
  }

  public PriceTypes getPriceType() {
    return priceType;
  }

  public boolean isFinished() {
    return finished;
  }

  public int getPaymentBundleId() {
    return paymentBundleId;
  }

  public String getTaxPercentFormatted() {
    return taxPercentFormatted;
  }
}
