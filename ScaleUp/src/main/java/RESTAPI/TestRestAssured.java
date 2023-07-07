package RESTAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestRestAssured {

    @Test
    public void testGetRequest() {
        // Set the base URL of the API
        RestAssured.baseURI = "https://api.example.com";

        // Send a GET request to retrieve user information
        Response response = RestAssured
                .given()
                .header("Authorization", "Bearer your_access_token")
                .when()
                .get("/users/12345");

        // Extract information from the response
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        // Print the response details
        System.out.println("Response Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);

        // Perform assertions or further processing based on the response
        // ...
    }

    @Test
    public void testPostRequest() {
        // Set the base URL of the API
        RestAssured.baseURI = "https://api.example.com";

        // Define the request payload
        String requestBody = "{\"name\": \"John Doe\", \"email\": \"johndoe@example.com\"}";

        // Send a POST request to create a new user
        Response response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/users");

        // Extract information from the response
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();

        // Print the response details
        System.out.println("Response Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);

        // Perform assertions or further processing based on the response
        // ...
    }
}
