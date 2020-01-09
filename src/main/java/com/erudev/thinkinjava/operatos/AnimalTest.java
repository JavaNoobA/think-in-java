package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/8.
 */
class Dog{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    void says(String msg){
        System.out.println(msg);
    };
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog spot = new Dog("spot");
        spot.says("Ruff!");
        Dog scruffy = new Dog("scruffy");
        scruffy.says("scruffy!");

        Dog jeff = new Dog("jeff");
        jeff = spot;
        System.out.println(jeff.equals(spot));
    }
}
