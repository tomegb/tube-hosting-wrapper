package com.tube.hosting.java.tube.requests;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.tube.hosting.java.tube.RestAccess;
import com.tube.hosting.java.tube.objects.PlainMessage;
import com.tube.hosting.java.tube.objects.ResponsableObject;
import com.tube.hosting.java.tube.requests.post.PostLoginRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractRequest<T extends ResponsableObject> {

  protected static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
  protected static final String TUBE_API_LINK = "https://api.tube-hosting.com/";
  protected static final Executor TOKEN_UPDATER = Executors.newCachedThreadPool();

  private final String path;
  private final Class<T> responseClass;

  private T responseObject;
  private int statusCode;

  protected AbstractRequest(String path, Class<T> responseClass) {
    this.path = path;
    this.responseClass = responseClass;
  }

  private void executeRequest(@NotNull RestAccess restAccess, boolean firstRequest) throws IllegalStateException {
    OkHttpClient client = restAccess.getClient();
    Request request = prepareBuilder(restAccess).build();

    try (Response response = client.newCall(request).execute()) {
      statusCode = response.code();
      String responseMessage = response.message();

      if (statusCode != 200) {
        if (firstRequest && statusCode == 401) {
          updateTokenSync(restAccess);
          executeRequest(restAccess, false);
          return;
        }

        throw new IllegalStateException("Response is not successfully and results cannot be loaded. " + statusCode);
      }

      ResponseBody responseBody = response.body();
      if (responseBody == null) {
        throw new IllegalStateException("ResponseBody cannot be loaded.");
      }

      parseObject(responseBody, responseMessage);

      if (restAccess.updateRequired()) {
        updateTokenAsync(restAccess);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void executeRequest(@NotNull RestAccess restAccess) {
    executeRequest(restAccess, true);
  }

  private void parseObject(@NotNull ResponseBody responseBody, String responseMessage) throws IOException {
    try {
      JsonObject responseBodyObject = JsonParser.parseString(responseBody.string()).getAsJsonObject();
      responseObject = GSON.fromJson(responseBodyObject, responseClass);
    } catch (JsonSyntaxException e) {
      responseObject = (T) new PlainMessage(responseMessage);
    }
  }

  protected void updateTokenSync(@NotNull RestAccess restAccess) {
    PostLoginRequest loginRequest = new PostLoginRequest(restAccess.getEmail(), restAccess.getPassword());
    loginRequest.executeRequest(restAccess);
  }

  protected void updateTokenAsync(RestAccess restAccess) {
    TOKEN_UPDATER.execute(() -> updateTokenSync(restAccess));
  }

  protected Builder prepareBuilder(@NotNull RestAccess restAccess) {
    return new Builder()
        .url(TUBE_API_LINK + path)
        .addHeader("Authorization", "Bearer " + restAccess.getToken());
  }

  public int getStatusCode() {
    return statusCode;
  }

  @Nullable
  public T getResponseObject() {
    return responseObject;
  }
}
