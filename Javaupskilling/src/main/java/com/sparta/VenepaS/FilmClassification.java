package com.sparta.VenepaS;
public class FilmClassification {


    public static String getClassificationsByAge(int ageOfViewer)
    {
        String age;
        if (ageOfViewer < 12)
        {
            age = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer < 15)
        {
            age = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            age = "All films are available.";
        }
        return age;
    }
}