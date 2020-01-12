package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
class Window{
    Window(int maker){
        System.out.println("Window(" + maker + ")");
    }
}

class House{
    Window w1 = new Window(1);

    House(){
        System.out.println("House()");
        w1 = new Window(33);
    }
    Window w2 = new Window(2);

    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }
}
