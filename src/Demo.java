package newproj.newproj;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo {

    // Set up base URI before each test method
    @BeforeMethod
    public void before() {
        RestAssured.baseURI = "http://httpstat.us";
    }

    // Test for 101 Switching Protocols (Informational)
    @Test(description = "Test demo API for status 101")
    public void test101() {
        RestAssured.given().when().get("/101").then().statusCode(101);
    }

    // Test for 200 OK
    @Test(description = "Test demo API for status 200")
    public void test200() {
        RestAssured.given().when().get("/200").then().statusCode(200);
    }

    // Test for 201 Created
    @Test(description = "Test demo API for status 201")
    public void test201() {
        RestAssured.given().when().get("/201").then().statusCode(201);
    }

    // Test for 202 Accepted
    @Test(description = "Test demo API for status 202")
    public void test202() {
        RestAssured.given().when().get("/202").then().statusCode(202);
    }

    // Test for 301 Moved Permanently (Redirection)
    @Test(description = "Test demo API for status 301")
    public void test301() {
        RestAssured.given().when().get("/301").then().statusCode(301);
    }

    // Test for 302 Found (Redirection)
    @Test(description = "Test demo API for status 302")
    public void test302() {
        RestAssured.given().when().get("/302").then().statusCode(302);
    }

    // Test for 400 Bad Request (Client Error)
    @Test(description = "Test demo API for status 400")
    public void test400() {
        RestAssured.given().when().get("/400").then().statusCode(400);
    }

    // Test for 401 Unauthorized (Client Error)
    @Test(description = "Test demo API for status 401")
    public void test401() {
        RestAssured.given().when().get("/401").then().statusCode(401);
    }

    // Test for 402 Payment Required (Client Error)
    @Test(description = "Test demo API for status 402")
    public void test402() {
        RestAssured.given().when().get("/402").then().statusCode(402);
    }

    // Test for 404 Not Found (Client Error)
    @Test(description = "Test demo API for status 404")
    public void test404() {
        RestAssured.given().when().get("/404").then().statusCode(404);
    }

    // Test for 405 Method Not Allowed (Client Error)
    @Test(description = "Test demo API for status 405")
    public void test405() {
        RestAssured.given().when().get("/405").then().statusCode(405);
    }

    // Test for 500 Internal Server Error (Server Error)
    @Test(description = "Test demo API for status 500")
    public void test500() {
        RestAssured.given().when().get("/500").then().statusCode(500);
    }

    // Test for 501 Not Implemented (Server Error)
    @Test(description = "Test demo API for status 501")
    public void test501() {
        RestAssured.given().when().get("/501").then().statusCode(501);
    }

    // Test for 502 Bad Gateway (Server Error)
    @Test(description = "Test demo API for status 502")
    public void test502() {
        RestAssured.given().when().get("/502").then().statusCode(502);
    }

    // Test for 503 Service Unavailable (Server Error)
    @Test(description = "Test demo API for status 503")
    public void test503() {
        RestAssured.given().when().get("/503").then().statusCode(503);
    }

    // Test for 504 Gateway Timeout (Server Error)
    @Test(description = "Test demo API for status 504")
    public void test504() {
        RestAssured.given().when().get("/504").then().statusCode(504);
    }

    // Test for 505 HTTP Version Not Supported (Server Error)
    @Test(description = "Test demo API for status 505")
    public void test505() {
        RestAssured.given().when().get("/505").then().statusCode(505);
    }

    // Test for 507 Insufficient Storage (Server Error)
    @Test(description = "Test demo API for status 507")
    public void test507() {
        RestAssured.given().when().get("/507").then().statusCode(507);
    }

    // Test for 508 Loop Detected (Server Error)
    @Test(description = "Test demo API for status 508")
    public void test508() {
        RestAssured.given().when().get("/508").then().statusCode(508);
    }
}
