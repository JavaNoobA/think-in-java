package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/8.
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2/2 + z; // 5
        int b = x + (y - 2)/(2 + z); // 1
        System.out.println("a =" + a + " b = " + b);
    }
}
