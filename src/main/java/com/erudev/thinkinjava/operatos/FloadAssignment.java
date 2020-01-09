package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/8.
 */
class Bar{
    float foo;
}

public class FloadAssignment {
    public static void main(String[] args) {
        Bar b1 = new Bar();
        Bar b2 = new Bar();

        b1.foo = 24f;
        b2.foo = 18f;
        System.out.println("1: b1 foo = " + b1.foo + " b2 foo = " + b2.foo); // 24 18

        b1 = b2;
        System.out.println("2: b1 foo = " + b1.foo + " b2 foo = " + b2.foo); // 18 18

        b1.foo = 35f;
        System.out.println("3: b1 foo = " + b1.foo + " b2 foo = " + b2.foo); // 35 35
    }
}
