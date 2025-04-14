package com.backendWithJava.MicroservicesCommunicationProtocols.RestAPI.WaystoHitAPI.ApacheHttpClient;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

/*

Authentication
HttpClient supports various authentication mechanisms, such as Basic and Digest Authentication.
 */
public class Chapter6 {
    public static void main(String[] args) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                new AuthScope("httpbin.org", 80),
                new UsernamePasswordCredentials("user", "password")
        );

        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider)
                .build();



//        SSL/TLS Configuration
//        You can configure SSL (Secure Sockets Layer) to send secure requests.

        SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(new TrustSelfSignedStrategy()).build();
        CloseableHttpClient httpClient1 = HttpClients.custom().setSSLContext(sslContext).build();

//        Handling Timeouts
//        Set connection and read timeouts to ensure your request doesn’t hang indefinitely.

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000)   // Connection timeout (ms)
                .setSocketTimeout(5000)    // Socket timeout (ms)
                .build();

//        Using a Proxy
//        You can configure HttpClient to route requests through a proxy server.

        HttpHost proxy = new HttpHost("proxy.example.com", 8080);
        RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
        CloseableHttpClient httpClient2 = HttpClients.custom().setDefaultRequestConfig(config).build();



//        Request Interceptors
//        You can intercept requests and responses to modify them or log information.

        RequestConfig requestConfig1 = RequestConfig.custom()
                .setConnectionRequestTimeout(5000)
                .setSocketTimeout(5000)
                .build();

        HttpRequestInterceptor requestInterceptor = (request, context) -> {
            request.setHeader("Custom-Header", "value");
        };

        CloseableHttpClient closeableHttpClient = HttpClients.custom()
                .addInterceptorFirst(requestInterceptor)
                .setDefaultRequestConfig(requestConfig1)
                .build();

    }

}
