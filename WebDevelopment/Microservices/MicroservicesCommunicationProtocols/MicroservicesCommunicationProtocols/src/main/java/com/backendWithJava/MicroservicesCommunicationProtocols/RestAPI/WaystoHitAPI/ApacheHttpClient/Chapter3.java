package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;


/*
3. Working with Requests
    Creating and Configuring Requests
    Requests in HttpClient can be configured by setting various properties, such as headers, body content, and parameters.
Headers
    Headers are key-value pairs sent along with the request to provide additional information (e.g., content type, authentication).


 */
import org.apache.http.client.methods.HttpGet;

public class Chapter3 {
    public static void main(String[] args) {
        HttpGet getRequest = new HttpGet("http://httpbin.org/get");
        getRequest.setHeader("User-Agent", "Mozilla/5.0");


        String url = "http://httpbin.org/get?name=John&age=30";
        HttpGet getRequest1 = new HttpGet(url);

    }
}
