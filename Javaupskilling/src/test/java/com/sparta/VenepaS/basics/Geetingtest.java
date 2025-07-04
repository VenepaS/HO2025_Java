package com.sparta.VenepaS.basics;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Geetingtest {
    @Test
    @DisplayName("My first test")
    public void myFirstTest(){
        Assertions.assertTrue(true);
    }
    @Test
    @DisplayName("greeting retrun to goodevening with input 21")
    public void mySecondTest(){
        //arrange
        int time = 21;
        String expected = "Good evening!";
                //Act
        String actual = Main.greeting(time);

        //Assert
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Greeting yo retrun Goodmorning with input 11")
    public void myThirdTest(){
        int time = 11;
        String expected = "Good morning!";
        String actual = Main.greeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Greeting yo retrun Goodmorning with input 11")
    public void greetingThrowExceptionTest(){
        int time = -1;
        //String expected = "Good morning!";
        //String actual = Main.greeting(time);
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> Main.greeting(time));
        Assertions.assertTrue("Must be " , exception.getMessage());
       // Assertions.assertEquals(expected, actual);
    }


}
