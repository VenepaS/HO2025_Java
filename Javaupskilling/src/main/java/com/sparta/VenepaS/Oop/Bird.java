package com.sparta.VenepaS.Oop;
public class Bird extends Animal{
    private String favouriteFood;
    public Bird(String Name, int year, int month, int day, String favouriteFood) {
        super(Name, year, month, day);
        this.favouriteFood = favouriteFood;
    }
    public String getPosition() {
        return favouriteFood;

    }

    @Override
    public String Speak() {
        return "test";
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am " + getName() + " years old.";
    }

    @Override
    public String eat() {
        return "i am eating bird food";
    }
}