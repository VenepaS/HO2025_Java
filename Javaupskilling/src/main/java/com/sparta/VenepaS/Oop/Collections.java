package com.sparta.VenepaS.Oop;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collections {
    public static void main(String[] args) {

System.out.println(longWordList("Hello my Name is Supriya"));
    System.out.println(makeFiveSet(80));
    }
    public static HashSet<Integer> makeFiveSet(int max){
        HashSet<Integer> result = new HashSet<>();//
        // logic goes here anything divisible by 5//
        // for loop anything divisible by 5 will be added to the hashset
        // return result;
        for (int i = 1; i <= max; i++) {
        if (i % 5 == 0) {
            result.add(i);
             }
 }
 return result;

    }


   public static List<String> longWordList(String phrase) {
List<String> result = new ArrayList<>();

 String[] words = phrase.split("\\s+");
 for (String word : words) {
     if (word.length() >= 5) {
     result.add(word);
 }}
 return result;
}}

