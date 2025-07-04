package com.sparta.VenepaS.basics;

import java.util.*;

public class CollectionReview {

    public static void main(String[] args) {
        //Declare on arraylist  of strings
        ArrayList<String> myList1 = new ArrayList<>();
        List<String> myList2 =  new ArrayList<>(List.of("T","B"));
        var myList3 = new ArrayList<String>() ;
        myList3.add("T");
        myList3.add("B");
        System.out.println(myList1.get(2));
        System.out.println(myList1);

        HashSet<String> mySet = new HashSet<>();
        mySet.add("T");
        mySet.add("B");
        mySet.add("T");
        System.out.println(mySet);

        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"T");
        myMap.put(2,"B");
        System.out.println(myMap);
    }
}
