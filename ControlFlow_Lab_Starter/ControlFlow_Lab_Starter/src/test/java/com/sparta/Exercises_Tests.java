package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14));
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15));
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }

    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage() {
        int[] nums = {3, 8, 1, 7, 3};
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero() {
        int[] nums = {};
        Assertions.assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource({
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected) {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here
    @Test
    @DisplayName("Grade")
    public void gradeTest() {

        Assertions.assertEquals("Pass with Distinction", Exercises.grade(75));
        Assertions.assertEquals("Pass with Distinction", Exercises.grade(100));

        Assertions.assertEquals("Pass with Merit", Exercises.grade(74));
        Assertions.assertEquals("Pass with Merit", Exercises.grade(60));
        Assertions.assertEquals("Pass", Exercises.grade(40));
        Assertions.assertEquals("Pass", Exercises.grade(59));
        Assertions.assertEquals("Fail", Exercises.grade(39));

    }

    // write unit tests for the Scottish wedding example here
    @Test
    public void  ScottishWeddingTest() {
        Assertions.assertEquals(20, Exercises.getScottishMaxWeddingNumber(4));
        Assertions.assertEquals(50, Exercises.getScottishMaxWeddingNumber(3));
        Assertions.assertEquals(100, Exercises.getScottishMaxWeddingNumber(1));
        Assertions.assertEquals(200, Exercises.getScottishMaxWeddingNumber(0));
    }
}

