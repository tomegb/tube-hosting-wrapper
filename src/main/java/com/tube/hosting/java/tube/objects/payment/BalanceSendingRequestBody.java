package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;
import org.jetbrains.annotations.NotNull;

public class BalanceSendingRequestBody extends ResponsableObject {

  private final @NotNull String toMail;
  private final int amount;
  private final @NotNull String description;

  /**
   * @param amount (Cent)
   */
  public BalanceSendingRequestBody(@NotNull String toMail, int amount, @NotNull String description) {
    this.toMail = toMail;
    this.amount = amount;
    this.description = description;
  }

  @NotNull
  public String getToMail() {
    return toMail;
  }

  public int getAmount() {
    return amount;
  }

  @NotNull
  public String getDescription() {
    return description;
  }

}
