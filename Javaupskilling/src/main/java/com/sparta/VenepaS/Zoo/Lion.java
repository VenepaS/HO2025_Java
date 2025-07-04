package com.sparta.VenepaS.Zoo;

public class Lion extends Animal{

    public Lion(String name) {
 super(name);
 }
    @Override
    public String talk() {
        return "Gurr! I'm " + name + " the Lion.";
    }



}
