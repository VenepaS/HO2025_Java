package com.sparta.VenepaS.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Film {
    @Test
    @DisplayName("ageviwer as 11")
    public void MyFirstfilmtest() {
        int Age = 11;
        String Expected = "U, PG & 12 films are available.";
        String actual = FilmClassification.getClassificationsByAge(Age);
        Assertions.assertEquals(Expected, actual);
    }

    @Test
    @DisplayName("ageviewer as 14")
    public void Mysecondfilmtest() {
        int Age = 14;
        String Expected = "U, PG, 12 & 15 films are available.";
        String actual = FilmClassification.getClassificationsByAge(Age);
        Assertions.assertEquals(Expected, actual);
    }
    @Test
@DisplayName("ageviewer as 15")
public void Mythirdfilmtest() {
 int Age = 15;
 String Expected = "All films are available.";
String actual = FilmClassification.getClassificationsByAge(Age);
Assertions.assertEquals(Expected, actual);
 }

    @ParameterizedTest
    @ValueSource(ints = {20,21,22,23,25,90})
    @DisplayName("Parametierzed tests")
    void example(int input) {
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(input));
    }
}