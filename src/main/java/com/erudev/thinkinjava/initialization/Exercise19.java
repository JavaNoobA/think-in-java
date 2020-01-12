package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class Exercise19 {
    static void f(String... args){
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        f("A", "b", "c");
        f(new String[]{"a", "b"});
    }
}
