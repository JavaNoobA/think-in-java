package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
class Person{
    public void eat(Apple apple){
        apple.getPeele();
        System.out.println("yummy");
    }
}

class Apple{
    Apple getPeele(){
        return Peeler.peel(this);
    }
}

class Peeler{
    static Apple peel(Apple apple){
        // remove peel
        return apple;
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
