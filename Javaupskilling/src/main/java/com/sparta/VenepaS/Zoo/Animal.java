package com.sparta.VenepaS.Zoo;

public abstract class Animal implements Speakable {

    protected String name;

 public Animal(String name) {
 this.name = name;
 }

public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }
}
