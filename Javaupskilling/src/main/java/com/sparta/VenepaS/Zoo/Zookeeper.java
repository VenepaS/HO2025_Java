package com.sparta.VenepaS.Zoo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Zookeeper extends Staff{



        public Zookeeper(String name, String joiningDate, String shift) {
            super(name, joiningDate, shift);
        }

        public String feedAnimals() {
            return "Zookeeper " + name + " is feeding the animals.";
        }

        public String cleanEnclosure() {
            return "Zookeeper " + name + " cleaned the enclosures.";
        }

        public String checkAnimalHealth() {
            return "Zookeeper " + name + " checked the health of all assigned animals.";
        }

        @Override
        public String talk() {
            return "Hello, I'm " + name + ", your zookeeper today!";
        }
    }






