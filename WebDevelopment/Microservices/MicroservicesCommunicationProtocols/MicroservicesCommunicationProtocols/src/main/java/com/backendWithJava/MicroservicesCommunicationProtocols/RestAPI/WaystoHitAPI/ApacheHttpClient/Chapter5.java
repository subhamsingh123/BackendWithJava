package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;


import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

/*

5. Advanced Topics
Connection Management
HttpClient uses connection pooling to improve performance by reusing connections.
The connection pool can be configured as follows:

 */
public class Chapter5 {

    public static void main(String[] args) {

       try( PoolingHttpClientConnectionManager poolingConnManager = new PoolingHttpClientConnectionManager()){
           poolingConnManager.setMaxTotal(100);  // Max connections
           poolingConnManager.setDefaultMaxPerRoute(20);  // Max connections per route

       }

    }
}
