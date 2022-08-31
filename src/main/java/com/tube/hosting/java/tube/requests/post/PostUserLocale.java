package com.tube.hosting.java.tube.requests.post;

import com.tube.hosting.java.tube.objects.Locale;
import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.requests.AbstractPostRequest;

public class PostUserLocale extends AbstractPostRequest<PlainMessage, Locale> {

  public PostUserLocale(Locale locale) {
    super("me/locale", PlainMessage.class, locale);
  }
}
