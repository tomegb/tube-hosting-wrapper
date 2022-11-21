package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class PaymentBundle extends ResponsableObject {

  private final int id;
  private final BalanceChange balanceChange;
  private final Payment payment;
  private final Invoice invoice;
  private final String time;
  private final int amount;
  private final int userId;

  public PaymentBundle(int id, BalanceChange balanceChange, Payment payment, Invoice invoice, String time, int amount,
      int userId) {
    this.id = id;
    this.balanceChange = balanceChange;
    this.payment = payment;
    this.invoice = invoice;
    this.time = time;
    this.amount = amount;
    this.userId = userId;
  }

  public BalanceChange getBalanceChange() {
    return balanceChange;
  }

  public Payment getPayment() {
    return payment;
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

  public int getId() {
    return id;
  }
}
