package com.erudev.thinkinjava.control;

/**
 * Created by eru on 2020/1/9.
 */
public class WhileTest {

    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        while (condition()){
            System.out.println("in while");
        }
        System.out.println("while end");

        do {
            System.out.println("in do");
        }while (1 > 2);
    }
}
