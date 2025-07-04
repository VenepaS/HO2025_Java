package com.sparta.VenepaS.basics;

public class Person {

    private static String name = "Supriyavenepally";
    private static String code = "206166";
    public static void main(String[] args) {

        String CodeAndName  = code+ "  "+ name;
        System.out.println(CodeAndName);
    }

    public static String getName() {

return code + "  "+ name;

    }
}
