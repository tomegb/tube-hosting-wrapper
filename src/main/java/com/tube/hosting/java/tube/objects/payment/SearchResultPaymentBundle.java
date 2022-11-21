package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class SearchResultPaymentBundle extends ResponsableObject {

  private final long count;
  private final int page;
  private final int size;
  private final PaymentBundle[] items;
  private final Invoice invoice;
  private final String time;
  private final int amount;
  private final int userId;

  public SearchResultPaymentBundle(long count, int page, int size, PaymentBundle[] items, Invoice invoice, String time,
      int amount, int userId) {
    this.count = count;
    this.page = page;
    this.size = size;
    this.items = items;
    this.invoice = invoice;
    this.time = time;
    this.amount = amount;
    this.userId = userId;
  }

  public long getCount() {
    return count;
  }

  public int getPage() {
    return page;
  }

  public int getSize() {
    return size;
  }

  public PaymentBundle[] getItems() {
    return items;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public String getTime() {
    return time;
  }

  public int getAmount() {
    return amount;
  }

  public int getUserId() {
    return userId;
  }
}
