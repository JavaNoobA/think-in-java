package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class ByteTest {
    public static void main(String[] args) {
        int b = -1;
        System.out.println(Integer.toBinaryString(b));
        b <<= 3;
        System.out.println(Integer.toBinaryString(b));
        for (int i = 0; i < 32; i++) {
            b >>>= 1;
            System.out.println(Integer.toBinaryString(b));
        }
    }
}
