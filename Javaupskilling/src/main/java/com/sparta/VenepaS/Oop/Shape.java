package com.sparta.VenepaS.Oop;

public abstract class   Shape {
    public abstract int calculateArea();

    @Override
    public String toString() {
        return getClass().getName() + " Area: " + calculateArea();
    }
}
