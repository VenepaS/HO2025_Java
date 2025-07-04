package com.sparta.VenepaS.Oop;

public class Circle extends Shape {
    private double radius;
    public  Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int)(radius * radius * Math.PI);
    }
    //create a circle class which extends shape
    //Pi r 2  is area
    //    circle just need one field radius
}
