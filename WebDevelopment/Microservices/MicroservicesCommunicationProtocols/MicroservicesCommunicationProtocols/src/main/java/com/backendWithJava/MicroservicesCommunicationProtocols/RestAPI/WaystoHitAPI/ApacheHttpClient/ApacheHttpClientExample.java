package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.util.Timeout;
import org.apache.hc.client5.http.config.RequestConfig;


public class ApacheHttpClientExample {
    public static void main(String[] args) {
      HttpClient client = HttpClients.custom()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setResponseTimeout(Timeout.ofSeconds(10))
                        .build())
                .build();

        HttpGet request = new HttpGet("https://httpstat.us/200?sleep=15000");

        try {
            HttpResponse response = client.execute(request);
            System.out.println("Response: " + response.getCode());
        } catch (Exception e) {
            System.err.println("Error or Timeout: " + e.getMessage());
        }
    }
}
