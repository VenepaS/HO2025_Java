package com.sparta.VenepaS.basics;

public class Selection  {
    public static void main(String[] args) {
       System.out.println(getGradifelse(86));



    }

    public static String priority(int level){

        String priority = "Code ";
        switch (level){
            case 3:
                priority = priority + "Red";
                break;
            case 2:
            case 1:
                priority = priority + "Amber";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }

    public static String getGradifelse(int mark) {
        if (mark >= 85) {
            return "Distinction";
        } else if (mark >= 65) {
            return "Pass";
        } else {
            return "Fail";
        }

    }




    }
