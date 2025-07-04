package com.sparta.serenity.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static net.thucydides.core.environment.SystemEnvironmentVariables.createEnvironmentVariables;
import static org.hamcrest.Matchers.equalTo;

public class OutcodeLookupSteps {
    @When("I look up the outcode {string}")
    public void iLookUpTheOutcode(String outcode) {
        when().get(createEnvironmentVariables().getProperty("postcode.api.outcodes") + outcode);

    }

    @And("the returned outcode should be {string}")
    public void theReturnedOutcodeShouldBe(String expected) {
        then().body("result.outcode", equalTo(expected));

    }

    @And("the latitude is {float}")
    public void theLatitudeIs(float expected) {
        then().body("result.latitude", equalTo(expected));
    }
}
