package com.sparta.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

public class SingleOutcodeTestSadPath {
    private static Response response;
    @BeforeAll
    public static void beforeAll() {
                response = RestAssured
                .given()
                .baseUri("https://api.postcodes.io/")
                .basePath("outcodes/")
                .header("Accept", "text/json")
                .when()
                .get("AB4Y")
                .thenReturn();
    }
    @Test
    @DisplayName("Correct postcode is in response")
    public void testCorrectPostcodeReturned() {
        assertThat(response.statusCode(),is(404));
    }
}
