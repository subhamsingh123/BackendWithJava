package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpTimeoutException;
import java.time.Duration;

public class JavaHttpClientExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpstat.us/200?sleep=15000"))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response: " + response.body());
        } catch (HttpTimeoutException e) {
            System.err.println("Timeout after 10 seconds.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
