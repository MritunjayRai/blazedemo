package RESTAPI;

//In RestAssured, a Request Specification is an important concept that allows you to define
//and customize the details of an HTTP request. It provides a way to set headers,
//query parameters, request bodies, authentication, and other properties for a request.


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRequestSpecification {

    private RequestSpecification requestSpec;

    @BeforeClass
    public void setupRequestSpecification() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.example.com")
                .addHeader("Authorization", "Bearer your_access_token")
                .setContentType(ContentType.JSON)
                .build();
    }
//
//    private RequestSpecification requestSpec1;
//
//    @BeforeClass
//    public void setupRequestSpecification1(){
//        requestSpec1 = new RequestSpecBuilder()
//                .setBaseUri("https://api.example.com")
//                .addHeader("Authorization", "Bearer your_access_token")
//                .setContentType(ContentType.JSON)
//                .build();
//    }
    @Test
    public void testGetRequest() {
        RestAssured
                .given()
                .spec(requestSpec)
                .when()
                .get("/users/12345")
                .then()
                .statusCode(200);
    }

//    @Test
//    public void testGetRequest1(){
//        RestAssured
//                .given()
//                .spec(requestSpec)
//                .when()
//                .get("/users/12345")
//                .then()
//                .statusCode(200);
//    }
//


    @Test
    public void testPostRequest() {
        String requestBody = "{\"name\": \"John Doe\", \"email\": \"johndoe@example.com\"}";

        RestAssured
                .given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/users")
                .then()
                .statusCode(201);
    }

//    @Test
//    public void testPostRequest1(){
//
//        String requestBody1="{\"name\": \"Jon Doe\", \"email\": \"jhondoe@example.com\"}";
//
//        RestAssured
//                .given()
//                .spec(requestSpec)
//                .body(requestBody1)
//                .when()
//                .post("/users")
//                .then()
//                .statusCode(201);
//    }

}
