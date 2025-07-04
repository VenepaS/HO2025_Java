package com.sparta.VenepaS.Oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Animal implements Eatable{
    public abstract String Speak();
    protected   String name;
    protected LocalDate birthDate;

    public Animal(String name, int year, int month, int day){
        this.name = name;
        this.birthDate = LocalDate.of(year,month,day);
    }


    public Long getAge(){
              return  birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(birthDate, animal.birthDate);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Animal " + name + " " + "Age " +getAge();
    }



    }


