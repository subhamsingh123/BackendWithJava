package Java.API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiCaller {
    public static void main(String[] args) {
        try {
            // Sample API endpoint
            String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";

            // Create a URL object
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method
            connection.setRequestMethod("GET");

            // Set headers (optional)
            connection.setRequestProperty("Accept", "application/json");

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read response
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = reader.readLine()) != null) {
                    response.append(inputLine);
                }
                reader.close();

                // Print response
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("Failed to fetch data!");
            }

            // Close connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
