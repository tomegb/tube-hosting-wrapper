package com.tube.hosting.java.tube.objects.payment;

import com.tube.hosting.java.tube.objects.ResponsableObject;

public class SearchResultBalanceChange extends ResponsableObject {

  private final int count;
  private final int page;
  private final int size;
  private final BalanceChange[] items;
  private final boolean empty;
  private final boolean notEmpty;

  public SearchResultBalanceChange(int count, int page, int size, BalanceChange[] items, boolean empty,
      boolean notEmpty) {
    this.count = count;
    this.page = page;
    this.size = size;
    this.items = items;
    this.empty = empty;
    this.notEmpty = notEmpty;
  }

  public int getCount() {
    return count;
  }

  public int getPage() {
    return page;
  }

  public int getSize() {
    return size;
  }

  public BalanceChange[] getItems() {
    return items;
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isNotEmpty() {
    return notEmpty;
  }
}
