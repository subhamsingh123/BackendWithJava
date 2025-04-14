package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

public class SpringWebClientExample {
    public static void main(String[] args) {
        WebClient client = WebClient.builder()
                .baseUrl("https://httpstat.us")
                .build();

        try {
            String response = client.get()
                    .uri("/200?sleep=15000")
                    .retrieve()
                    .bodyToMono(String.class)
                    .timeout(Duration.ofSeconds(10))
                    .onErrorResume(e -> {
                        System.err.println("Timeout or error: " + e.getMessage());
                        return Mono.empty();
                    })
                    .block();

            System.out.println("Response: " + response);
        } catch (Exception e) {
            System.err.println("Failed: " + e.getMessage());
        }
    }
}
