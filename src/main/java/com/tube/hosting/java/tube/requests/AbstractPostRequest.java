package com.tube.hosting.java.tube.requests;

import com.tube.hosting.java.tube.RestAccess;
import com.tube.hosting.java.tube.objects.ResponsableObject;
import okhttp3.MediaType;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractPostRequest<T extends ResponsableObject, R> extends AbstractRequest<T> {

  protected static final MediaType MEDIA_TYPE = MediaType.parse("application/json");

  private final R requestBody;

  protected AbstractPostRequest(String path, Class<T> responseClass, R requestBody) {
    super(path, responseClass);
    this.requestBody = requestBody;
  }

  @Override
  protected Builder prepareBuilder(@NotNull RestAccess restAccess) {
    return super.prepareBuilder(restAccess).method("POST",
        RequestBody.create(GSON.toJson(requestBody), MEDIA_TYPE));
  }
}
