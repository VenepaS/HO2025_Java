package com.sparta.VenepaS.Oop;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;



public class Collectionstest {
    @Test
    public void makeFiveSet(){

        List<Integer> expected = List.of(5, 10, 15, 20);
        Assertions.assertTrue(Collections.makeFiveSet(20).contains(5));
        Assertions.assertTrue(Collections.makeFiveSet(20).contains(10));
        Assertions.assertTrue(Collections.makeFiveSet(20).contains(15));
        Assertions.assertTrue(Collections.makeFiveSet(20).contains(20));

    }
    @Test
    public void longWorldList(){
        String word  = " Hi this is very difficult string array ";
        List<String> expected = List.of("difficult", "string", "array");
        Assertions.assertEquals(expected, Collections.longWordList(word));
    }
}
