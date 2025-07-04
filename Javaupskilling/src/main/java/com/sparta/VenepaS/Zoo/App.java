package com.sparta.VenepaS.Zoo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Speakable> zooThings = new ArrayList<>();

 Zookeeper zookeeper1 = new Zookeeper("John", "2022-01-01", "Morning");
        Zookeeper zookeeper2 = new Zookeeper("Mark", "2025-02-01", "Afternoon");
  Lion lion = new Lion("Leo");
 Zebra zebra = new Zebra("Zara");

 zooThings.add(zookeeper1);
zooThings.add(lion);
 zooThings.add(zebra);

 for (Speakable s : zooThings) {
 System.out.println(s.talk());
 }

        System.out.println(zookeeper1.feedAnimals());
 System.out.println(zookeeper1.cleanEnclosure());
 System.out.println(zookeeper1.checkAnimalHealth());



    }
}
