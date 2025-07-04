package com.sparta;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(grade(-4));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()) ;
        }finally {
            System.out.println("Final block");
        }
    }
public static String grade(int mark) {
    if (mark < 0) {
        throw new IllegalArgumentException("Cannot have ");
    }


    if (mark > 60) {
        return "Pass";
    } else {
        return "Fail";



//    public static int  divide(int num1, int num2) {
    //return num1 / num2;
    // }
