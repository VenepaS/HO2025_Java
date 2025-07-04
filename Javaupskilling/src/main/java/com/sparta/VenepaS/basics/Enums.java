package com.sparta.VenepaS.basics;

public class Enums {

    // Assode - thse are costant values which we write in CPtails
    /*public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;*/
    public enum Season {
        SPRING,
        SUMMER,
        AUTUM,
        WINTER

    }

    public static void main(String[] args) {

        String dayOfTheWeek = daysOfTheWeek(Day.SUNDAY);
        System.out.println(dayOfTheWeek);
        Season seasonOfTheYear = Season.SPRING;

      /*      if (dayOfTheWeek == Day.SATURDAY || dayOfTheWeek == Day.SUNDAY) {
            System.out.println("It's the weekend");
        } else {
            System.out.println("It's a weekday");
        }
*/
       if (seasonOfTheYear == Season.SPRING) {
            System.out.println("The daffodils are out");
        } else if (seasonOfTheYear == Season.SUMMER) {
            System.out.println("This is Summer");
        } else if (seasonOfTheYear == Season.AUTUM) {
            System.out.println("This is AUTUM");
        } else {
            System.out.println("This is WINTER");

        }

    }

    public static String daysOfTheWeek(Day dayOfTheWeek) {
       String message  = "";
        switch (dayOfTheWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                message = "Have a lovely day at work";
                break;
            case FRIDAY:
                message = "Nearly the Weekend!";
                break;
            case SATURDAY:
            case SUNDAY:
                message ="Relax and Enjoy";
                break;

        }
        return message;



}

    }

