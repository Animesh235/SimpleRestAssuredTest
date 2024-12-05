package restassuredTest.restassuredTest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;

public class Api {

    @Test
    public static void testApi1() {
        RestAssured.baseURI = "https://simple-books-api.glitch.me";

        // Request Body for creating an order
        String requestBody = "{\n" +
                "  \"bookId\": \"1\",\n" +
                "  \"customerName\": \"John\"\n" +
                "}";

        // Send a POST request
        Response response = RestAssured.given()
                .header("Authorization", "23146e38278aaffd612576a2dc50c45cda6d603686ff097a35ce55de8e039b0c")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/orders/");

        // Validate response status code
        response.then().statusCode(201);

        // Validate specific fields in the response body
        assertEquals(response.jsonPath().get("created"), true, "Created field should be true");
        assertEquals(response.jsonPath().get("orderId"), "JvaIugMAzjm3EmtUIidyX", "Order ID mismatch");

        // Optionally, print the response body for debugging purposes
        System.out.println("Response Body: " + response.asString());
    }
}
