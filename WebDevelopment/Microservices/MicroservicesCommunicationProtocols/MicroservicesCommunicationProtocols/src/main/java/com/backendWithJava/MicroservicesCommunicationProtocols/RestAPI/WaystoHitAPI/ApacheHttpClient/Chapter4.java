package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;

import okhttp3.Response;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/*

4. Working with Responses
Handling Status Codes
The status code is returned by the server to indicate the result of the HTTP request.
    * 200 OK: Request was successful.
    * 404 Not Found: The resource was not found.
    * 500 Internal Server Error: The server encountered an error.

 */
public class Chapter4 {
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

                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode == 200) {
                    System.out.println("Success");
                    // Handle successful response
                } else {
                    // Handle errors
                }


//                Reading Response Content
//                You can read the body of the response using EntityUtils.
                String responseBody = EntityUtils.toString(response.getEntity());


//                Handling Cookies and Redirects
//                        * Apache HttpClient manages cookies automatically.
//                        * Redirects are also handled by default, but you can customize the behavior.
                RequestConfig config = RequestConfig.custom()
                        .setRedirectsEnabled(false)  // Disable automatic redirects
                        .build();


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
