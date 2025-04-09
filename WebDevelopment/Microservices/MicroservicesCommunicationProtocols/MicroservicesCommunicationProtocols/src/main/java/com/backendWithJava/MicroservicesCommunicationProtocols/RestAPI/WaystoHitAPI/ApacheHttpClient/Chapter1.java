package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;

/*
1. Getting Started with Apache HttpClient
        Introduction
        Apache HttpClient is part of the Apache HttpComponents project. It's designed to work with
         HTTP (HyperText Transfer Protocol) and provides easy-to-use methods for making HTTP requests.
         It abstracts complex details such as connection management, headers, cookies, and more.

        Setup and Dependencies
        To use Apache HttpClient in your Java project, you need to add it as a dependency in your
         pom.xml (if you're using Maven) or build.gradle (if you're using Gradle).
*/


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

    public class Chapter1 {
        public static void main(String[] args) {
            String url = "http://httpbin.org/get";  // Example URL

            try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
                // Create HTTP GET request
                HttpGet request = new HttpGet(url);

                // Execute the request
                try (CloseableHttpResponse response = httpClient.execute(request)) {
                    // Handle the response
                    HttpEntity entity = response.getEntity();
                    String responseString = EntityUtils.toString(entity);
                    System.out.println(responseString);  // Print the response body
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


