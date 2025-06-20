package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        String forecast = (temp < 15) ? "It's cold" : "It's hot";
        return forecast;
        //if (temp < 15)
           // return "It's cold";
        //else
            //return "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums) {
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            avg = (double)sum / nums.length;

        }
        return avg;
    }



    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age)
    {
        if(age>=18 && age<=59){
            return "Standard";
        }
        else if(age>=60){
            return "OAP";
        }
        else if(age>=13 && age<=17){
            return "Student";
        }else if(age>=5 && age<=12){
            return "Child";
        }else {
            return "Free";
        }

    }

    // Question 4
    public static String grade(int mark)
    {    String grademessage = "";
        if(mark>=75 && mark<=100){
            grademessage= "Pass with Distinction";
        }
        else if(mark>=60 && mark<=74){
            grademessage= "Pass with Merit";
        }
        else if(mark>=40 && mark<=59)
        {grademessage= "Pass";
        }
        else if (mark>=0 && mark<=39)
        {grademessage= "Fail";}

return grademessage;

    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel) {
        int weddingNumber = 0;
        switch (covidLevel) {
            case 4:
                weddingNumber = 20;
                break;
            case 3:
            case 2:
                weddingNumber = 50;
                break;
            case 1:
                weddingNumber = 100;
                break;
            case 0:
                weddingNumber = 200;
                break;

        }
        return weddingNumber;
    }



    }

