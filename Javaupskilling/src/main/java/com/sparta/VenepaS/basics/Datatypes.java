package com.sparta.VenepaS.basics;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Datatypes {

    public static void main(String[] args) {
        //int num = 3;
        //       //  ArrayList<String>
        // int anInt = 3;//explicicty typed
        // var vInt = 6;//implicity type
        //         int bint;
        //         bint =4;
        //         System.out.println(Byte.MAX_VALUE);
        //         System.out.println(Short.MAX_VALUE);
        //         System.out.println(Integer.MIN_VALUE);
        //         System.out.println(Long.MAX_VALUE);
        //         System.out.println(Double.MAX_VALUE);
        //
        //         int myInt = 3;
        //        // wrapper class -wrap any premitive type in class  so i can do more
        //         Integer myInt2 =3;
        //         double myDouble = 3.14;
        //         Double myDouble2 = 3.14;
        // //dates
        //
        //         var today = LocalDate.now();
        //         System.out.println(today);
        //         var nextweek = today.plusWeeks(1);
        //         System.out.println(nextweek);
        //
        //LocalDate myBirthday = LocalDate.991, Month: nov, 11);
         //   System.out.println(myBirthday);
        LocalDate nishBday = LocalDate.of(1989,11,2);

        System.out.println(nishBday.getYear());
        // Using the above code, use somemethods to findout how old I am

LocalDate today = LocalDate.now();
System.out.println(today);
System.out.println("You are " + (today.getYear()-nishBday.getYear() + "Year old"));

    }

}
