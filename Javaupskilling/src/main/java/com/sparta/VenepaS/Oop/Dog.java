package com.sparta.VenepaS.Oop;


import java.util.Objects;

public class Dog extends Animal{
    private String favouriteGame;
    public Dog(String Name, int year, int month, int day, String favouriteGame) {
        super(Name, year, month, day);
        this.favouriteGame= favouriteGame;
    }

    @Override
    public String Speak() {
        return "Woof";
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " and I am " + getAge() + " years old.";
    }

    public String getPosition() {
        return favouriteGame;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(birthDate, animal.birthDate);
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    public void setFavouriteGame(String favouriteGame) {
        this.favouriteGame = favouriteGame;
    }


    @Override
    public String eat() {
        return "I am eating Dog food";
    }

    public String favGame(){
        return "Running";
    }
}