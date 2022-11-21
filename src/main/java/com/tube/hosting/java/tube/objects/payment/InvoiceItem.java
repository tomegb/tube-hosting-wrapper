package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class InvoiceItem extends ResponsableObject {

  private final String newServiceGroupRuntime;
  private final String oldServiceGroupRuntime;
  private final String title;
  private final OrderTypes type;
  private final long runtimeDuration;
  private final int position;
  private final int unitPrice;
  private final int quantity;
  private final int serviceGroupId;
  private final String description;
  private final PriceTypes priceType;
  private final int invoiceId;

  public InvoiceItem(String newServiceGroupRuntime, String oldServiceGroupRuntime, String title, OrderTypes type,
      long runtimeDuration, int position, int unitPrice, int quantity, int serviceGroupId, String description,
      PriceTypes priceType, int invoiceId) {
    this.newServiceGroupRuntime = newServiceGroupRuntime;
    this.oldServiceGroupRuntime = oldServiceGroupRuntime;
    this.title = title;
    this.type = type;
    this.runtimeDuration = runtimeDuration;
    this.position = position;
    this.unitPrice = unitPrice;
    this.quantity = quantity;
    this.serviceGroupId = serviceGroupId;
    this.description = description;
    this.priceType = priceType;
    this.invoiceId = invoiceId;
  }

  public String getNewServiceGroupRuntime() {
    return newServiceGroupRuntime;
  }

  public String getOldServiceGroupRuntime() {
    return oldServiceGroupRuntime;
  }

  public String getTitle() {
    return title;
  }

  public OrderTypes getType() {
    return type;
  }

  public long getRuntimeDuration() {
    return runtimeDuration;
  }

  public int getPosition() {
    return position;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getServiceGroupId() {
    return serviceGroupId;
  }

  public String getDescription() {
    return description;
  }

  public PriceTypes getPriceType() {
    return priceType;
  }

  public int getInvoiceId() {
    return invoiceId;
  }
}
