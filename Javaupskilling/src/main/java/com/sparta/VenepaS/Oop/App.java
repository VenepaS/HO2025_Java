package com.sparta.VenepaS.Oop;


import java.util.*;
public  class App {
    public static void main(String[] args) {
        // Member nish = new Member( "Supriya", "Venepally",2025,06,20);
        //  System.out.println(nish.getFirstName());
        // nish.setLastName("Damera");
        // System.out.println(nish.getLastName());
        //System.out.println(nish.getFullName());
        Member noel = new Member("Neol", " Galla");
        BaseballMember dev = new BaseballMember("Dev", "Limba", 2024, 6, 22, "Short shop");
        System.out.println(dev.getFullName());
        System.out.println(dev.getMemberDays());
        System.out.println(dev.getPosition());
        var result = Math.sqrt(4);
        //static method belong to class Not the object that you create
        var result2 = Member.getType();
        //classname.method();to use static method
        //For non-static methods you must create object from class

        Animal animalName = new Animal("Lion", 1980, 6, 20) {
            @Override
            public String eat() {
                return "";
            }

            @Override
            public String Speak() {
                return "";
            }
        };

        animalName.setName("Tiger");

        System.out.println(animalName.getName());
        ;
        System.out.println(animalName.getAge());
        System.out.println(animalName.toString());


        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            //System.out.println(shape.toString());
            System.out.println(shape.calculateArea());
        }
        Dog dog = new Dog("Mylo", 2002, 4, 5, "Testone");
        System.out.println(dog.getFavouriteGame());
        Bird bird = new Bird("Parr", 2010, 3, 3, "Test");
        Animal[] animals = {animalName, dog, bird};

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println("I say: " + animal.Speak());
            System.out.println();
        }

        var a1 = new Dog("Monkey", 2000, 4, 20, "Running");
        var a2 = new Dog("Monkey", 2000, 4, 20, "Running");
        var a3 = a1;
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());


        var m1 = new Member("Nish", "Mandal"); // Mem location 1
        var m2 = new Member("Nish", "Mandal"); // Memory location 2
        var m3 = m1;

        // By deafult - objects are compared based on their memory location
        // We can override the base implementation of equals() so that it comapres firstName and LastName
        // So that if they're the same, they are considered equal
        System.out.println(m1.equals(m2));
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        // For two objects to be considered equal, .equals() must return true AND the hascodes msut be the same
        // Hascodes are used in some collections as a key
        String[] names = {"Hiren", "Dev", "Supriya", "Dunstan"};
        double[] weights = {-22.0, 51.5};
        var paul = new Member("Paul", "McCartney");
        var john = new Member("John", "Lennon");
        var ringo = new Member("Ringo", "Starr");
        var george = new Member("George", "Harrison");
        Member[] members = {john, paul, ringo, george};

//        for(Member m : members){
//            System.out.println(m.getFullName());
//        }
//
//        for(double d : weights){
//            System.out.println(d);
//        }
//
//        for(String s : names){
//            System.out.println(s);
//        }

        // ArrayList


        // List is an interface
        // ArrayList implements the List interface methods
        // I only have access to methods defined in the List interface when I declare it this way!
        List<Member> membersAL = new ArrayList<Member>();
        membersAL.add(paul);
        membersAL.add(john);
        membersAL.add(george);
        membersAL.add(ringo);

        ArrayList<Member> membersAl2 = new ArrayList<Member>(List.of(paul, john, george, ringo));

        System.out.println(membersAL.size());
        System.out.println(membersAL.get(0).getFullName());
        System.out.println(membersAL.contains(paul));


        for (Member m : membersAl2) {
            System.out.println(m.getFullName());
        }

        Member example = new BaseballMember("Nish", "Mandal", 2020, 10, 1, "Batter");

        var myList = Arrays.asList(members);

        // HashSets

        HashSet<String> membersHs = new HashSet<String>();
        membersHs.add("Nish");
        membersHs.add("Nash");
        membersHs.add("Nosh");
        membersHs.add("Nush");
        membersHs.add("Nush");
        System.out.println(membersHs);


        HashSet<Member> beatles = new HashSet<Member>();
        beatles.add(paul);
        beatles.add(john);
        beatles.add(ringo);
        beatles.add(george);
        beatles.add(new Member("Paul", "McCartney"));

        for (Member m : beatles) {
            System.out.println(m.getFullName());
        }

        // Hashmaps - ditionaries

        HashMap<String, Member> beatlesMap = new HashMap<String, Member>();
        beatlesMap.put("PAUL", paul);
        beatlesMap.put("JOHN", john);

        System.out.println(beatlesMap.get("PAUL").getFullName());

        // All keys
        var keys = beatlesMap.keySet();
        // All values
        var values = beatlesMap.values();
        // All keys AND values
        var kvPairs = beatlesMap.entrySet();

        System.out.println("Keys");
        for (String k : keys) {
            System.out.println(k);
        }

        System.out.println("Values");
        for (Member v : values) {
            System.out.println(v);
        }

        // Dictionaries - problem solving using HashMaps

        // Stacks and Queues - optional
    }
    }
