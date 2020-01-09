package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class ShortCircurt {

    static boolean test0(int val){
        System.out.println("test0(" + val + ")");
        System.out.println("result:" + (val < 1));
        return val < 1;
    }

    static boolean test2(int val){
        System.out.println("test2(" + val + ")");
        System.out.println("result:" + (val < 2));
        return val < 2;
    }

    static boolean test3(int val){
        System.out.println("test3(" + val + ")");
        System.out.println("result" + (val < 3));
        return val < 3;
    }

    public static void main(String[] args) {
        boolean b = test0(0) && test2(2) && test3(3);
        System.out.println("express is:" + b);
    }
}
