package com.tube.hosting.java.tube.requests;

import com.tube.hosting.java.tube.RestAccess;
import okhttp3.Request.Builder;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractGetRequest<T> extends AbstractRequest<T> {

  protected AbstractGetRequest(String path, Class<T> responseClass) {
    super(path, responseClass);
  }

  @Override
  protected Builder prepareBuilder(@NotNull RestAccess restAccess) {
    return super.prepareBuilder(restAccess).get();
  }
}
