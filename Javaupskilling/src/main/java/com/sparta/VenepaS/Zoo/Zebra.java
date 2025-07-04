package com.sparta.VenepaS.Zoo;

public class Zebra extends Animal {

        public Zebra(String name) {
            super(name);
        }

        @Override
        public String talk() {
            return "Neigh! I'm " + name + " the zebra.";
        }
    }


