package de.flammenfuchs.thebus.telemetryapi.impl.http;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import de.flammenfuchs.thebus.telemetryapi.impl.deserializer.ColorDeserializer;
import de.flammenfuchs.thebus.telemetryapi.impl.deserializer.MapDeserializer;
import lombok.Getter;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.awt.*;
import java.io.IOException;
import java.util.Map;

@Getter
public class HttpClient {

    public static final String BASE_URL = "http://localhost:37337/";

    private OkHttpClient httpClient;
    private Gson gson;

    public HttpClient() {
        httpClient = new OkHttpClient();
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss")
                .registerTypeAdapter(Color.class, new ColorDeserializer())
                .registerTypeAdapter(
                        new TypeToken<Map<String, Integer>>() {}.getType(),
                        new MapDeserializer<Integer>() {
                            @Override
                            protected Integer toValue(JsonElement element) {
                                return element.getAsInt();
                            }
                        })
                .create();

    }

    public String get(String httpEndpoint, HttpFailHandler failHandler) {
        Request request = new Request.Builder()
                .url(BASE_URL + httpEndpoint)
                .cacheControl(CacheControl.FORCE_NETWORK)
                .build();
        try {
            Response response = httpClient.newCall(request)
                    .execute();
            return response.body().string();
        } catch (Exception ex) {
            failHandler.onFail(httpEndpoint, ex);
            return null;
        }
    }

    public <T> T getJson(String httpEndpoint, Class<T> type, HttpFailHandler failHandler) {
        try {
            String json = get(httpEndpoint, failHandler);
            T jsonObject = gson.fromJson(json, type);
            if (jsonObject == null) {
                System.out.println("ERROR: " + BASE_URL + httpEndpoint + " returned an null/invalid jsonObject");
            }
            return jsonObject;
        } catch (Exception ex) {
            failHandler.onFail(httpEndpoint, ex);
            return null;
        }
    }
}
