package com.tube.hosting.java.tube.objects;

import org.jetbrains.annotations.NotNull;

public class BalanceSendingRequest extends  ResponsableObject{
    private final @NotNull String toMail;
    private final int amount;
    private final @NotNull String description;
    private final int amountObject;

    public BalanceSendingRequest(@NotNull String toMail, int amount, @NotNull String description, int amountObject) {
        this.toMail = toMail;
        this.amount = amount;
        this.description = description;
        this.amountObject = amountObject;
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

    public int getAmountObject() {
        return amountObject;
    }
}
