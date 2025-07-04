package com.sparta.VenepaS.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;


public class CalculatorStepDefs {

    private Calculator calculator ;
    private Integer actual;

    @Given("I have a calculator")
    public void iHaveACalculator() {
         calculator = new Calculator();
    }

    @And("I enter {int} and {int} into the calculator")
    public void iEnterAndIntoTheCalculator(int num1, int num2) {
        calculator.setNum1(num1);
        calculator.setNum2(num2);
    }

    @When("I press add")
    public void iPressAdd() {
       actual= calculator.add();
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int expected) {
        assertThat(actual, is(expected));
    }

    @When("I press subtract")
    public void iPressSubtract() {
        actual = calculator.subract();
    }

    @Then("the result should be <result>>")
    public void theResultShouldBeResult() {
    }

    @And("I enter <Input{int}> and <Input{int}> into the calculator")
    public void iEnterInputAndInputIntoTheCalculator(int arg0, int arg1) {
    }

    @When("I press multiply")
    public void iPressMultiply() {
        actual = calculator.multiply();
    }

    @When("I press divide")
    public void iPressDivide() {
        actual = calculator.divide();
    }
}
