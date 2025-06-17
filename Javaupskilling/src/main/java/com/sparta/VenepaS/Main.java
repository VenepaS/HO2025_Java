package com.sparta.VenepaS;


public class Main {
    public static void main(String[] args) {


        Integer result = substract(6,3);
        System.out.println(result);
    }

    public static Integer substract(int a ,int b) {
    int result = a - b;
    return result;
    }
    public static String greeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay <12 ){
            return "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <=18){
            return "Good afternoon";
        } else {
            return "Good evening!";
        }

    }
}