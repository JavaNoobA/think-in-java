package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class BinaryTest {

    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i= " + Integer.toBinaryString(~i));
        System.out.println("~j= " + Integer.toBinaryString(~j));
    }
}
