package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;
/*
2. HttpClient Fundamentals
HttpClient Overview
HttpClient is the core class for making HTTP requests. It can execute various types of HTTP requests like GET, POST, PUT, DELETE, etc.
        * HttpGet: Used for sending HTTP GET requests.
        * HttpPost: Used for sending HTTP POST requests.
        * HttpPut: Used for sending HTTP PUT requests.
        * HttpDelete: Used for sending HTTP DELETE requests.
Sending Requests
        * HttpGet Request: Retrieves information from the server.
        * HttpPost Request: Sends data to the server.
        * HttpPut Request: Updates data on the server.
        * HttpDelete Request: Deletes data from the server.

 */

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

public class Chapter2 {
    public static void main(String[] args) {
        String url = "http://httpbin.org/post"; // Example URL

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Create HTTP POST request
            HttpPost postRequest = new HttpPost(url);

            // Add JSON payload
            String json = "{\"name\":\"John Doe\", \"age\":30}";
            StringEntity entity = new StringEntity(json);
            postRequest.setEntity(entity);
            postRequest.setHeader("Content-Type", "application/json");

            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {
                // Handle the response
                HttpEntity responseEntity = response.getEntity();
                String responseString = EntityUtils.toString(responseEntity);
                System.out.println(responseString);  // Print the response body
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

