package com.sparta.VenepaS.morejunit;

import com.sparta.VenepaS.Oop.Bird;
import com.sparta.VenepaS.Oop.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTests {
    private Dog dog;
    private Bird bird;
    @Test
    public void makeFiveSet(){
        List<Integer> expected = List.of(5, 10, 15, 20);
    }


 @BeforeEach
 public void setUp() {
 dog = new Dog("Mylo",1990,8,8,"Running");
     bird = new Bird("Parrot",2002,3,3,"i am eating bird food");
 }

    @BeforeEach
    public void setUpBird() {

        bird = new Bird("Parrot",2002,3,3,"i am eating bird food");
    }

 @Test
 public void testSpeak() {
 assertEquals("Woof", dog.Speak());
 }

 @Test
    public void testEat() {
        assertEquals("i am eating bird food",bird.eat());
 }

@Test
    public void testgame() {
        assertEquals("Running",dog.favGame());
}
}
