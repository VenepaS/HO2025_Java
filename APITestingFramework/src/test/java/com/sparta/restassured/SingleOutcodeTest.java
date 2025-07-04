package com.sparta.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class SingleOutcodeTest {
    private static Response response;
    @BeforeAll
    public static void beforeAll() {
        response = RestAssured
                .given()
                .baseUri("https://api.postcodes.io/")
                .basePath("outcodes/")
                .header("Accept", "text/json")
                .when()
                .get("EC2Y")
                .thenReturn();
    }

    @Test
    @DisplayName("Status code 200 returned")
    public void testStatusCode200() {
        assertThat(response.statusCode(), is(200));
    }

    @Test
    @DisplayName("Server name is Cloudflare")
    public void testServerNameIsCloudflare() {
        assertThat(response.header("Server"), is("cloudflare"));
    }

    @Test
    @DisplayName("Correct postcode is in response")
    public void testCorrectPostcodeReturned() {
        assertThat(response.jsonPath().getList("result.admin_ward"),hasItem("Bunhill"));
    }


}
