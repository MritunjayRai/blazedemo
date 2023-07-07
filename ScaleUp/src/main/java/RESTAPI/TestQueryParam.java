package RESTAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestQueryParam {

    @Test
    public void testGetRequestWithQueryParams() {
        Response response = RestAssured
                                .given()
                                .queryParam("key1", "value1")
                                .queryParam("key2", "value2")
                                .when()
                                .get("https://api.example.com/users");

        // Process the response...
//        String responseBody = response.getBody().asString();
//
//        Response response1 = RestAssured
//                .given()
//                .queryParam("key1","value1")
//                .queryParam("key2","value2")
//                .when()
//                .get("https://api.example.com/users");
//        String responseBody1= response1.getBody().asString();
//        System.out.println(responseBody1);
    }
}
