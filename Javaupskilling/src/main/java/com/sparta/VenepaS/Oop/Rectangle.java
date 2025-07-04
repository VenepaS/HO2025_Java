package com.sparta.VenepaS.Oop;

public class Rectangle extends Shape{

    private int height ;
    private int length;
    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    //create acircle class which extends shape
    //Pi r 2  is area
    //    circle just need one field radius


    @Override
    public int calculateArea() {
        return length * height;
        }

    public int add(){
        return 1;
    }
}
