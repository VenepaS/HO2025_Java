package com.sparta.VenepaS.basics;


public class Main {
    public static void main(String[] args) {
int timeOfDay = 3;
try {
    String result = greeting(timeOfDay);
    System.out.println(result);
} catch (IllegalArgumentException e) {
    System.out.println("Caught exception" + e);
    System.out.println("Message"+ e.getMessage());
}finally {
    System.out.println("I am always run!");
}

        Integer result = substract(6,3);
        System.out.println(result);
    }

    public static Integer substract(int a ,int b) {
    int result = a - b;
    return result;
    }
    public static String greeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay <12 ){
            throw new Exception("Must be 5 to 12");

        }
            else if (timeOfDay >= 12 && timeOfDay <=18){
            return "Good afternoon";
        } else {
            return "Good evening!";
        }

    }
}