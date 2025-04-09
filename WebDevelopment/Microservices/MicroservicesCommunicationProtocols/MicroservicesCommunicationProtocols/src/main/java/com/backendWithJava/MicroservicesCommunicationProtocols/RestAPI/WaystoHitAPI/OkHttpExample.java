package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttpExample {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient.Builder()
                .callTimeout(10, TimeUnit.SECONDS)
                .build();

        Request request = new Request.Builder()
                .url("https://httpstat.us/200?sleep=15000")
                .build();

        try (Response response = client.newCall(request).execute()) {
            System.out.println("Response: " + response.body().string());
        } catch (IOException e) {
            System.err.println("Timeout or error: " + e.getMessage());
        }
    }
}

