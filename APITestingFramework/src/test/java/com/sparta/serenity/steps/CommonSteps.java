package com.sparta.serenity.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.thucydides.core.environment.SystemEnvironmentVariables.*;

public class CommonSteps {
    @Given("I am using the postcodes API")
    public void iAmUsingThePostcodesAPI() {
        given().baseUri(createEnvironmentVariables().getProperty("postcode.api.url")
                );
    }

    @Then("I should get a {int} response code")
    public void iShouldGetAResponseCode(int code) {
        then().statusCode(code);
    }
}
