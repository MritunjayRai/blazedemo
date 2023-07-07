package RESTAPI;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestResponseParsing {

    @Test
    public void testGetRequest() {
        Response response = RestAssured
                .given()
                .when()
                .get("https://api.example.com/users/12345");

        String responseBody = response.getBody().asString();

        // Parse the JSON response using Gson
        Gson gson = new Gson();
        User user = gson.fromJson(responseBody, User.class);

        // Access the user properties
        System.out.println("User ID: " + user.getId());
        System.out.println("User Name: " + user.getName());
        System.out.println("User Email: " + user.getEmail());

        // Perform assertions or further processing based on the response
        // ...
    }

    // User class for Gson deserialization
    class User {
        private String id;
        private String name;
        private String email;

        User(String id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        ;

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;

        }

    }
}
