package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class CharBinaryTest {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 10; i++) {
            System.out.println(Integer.toBinaryString(c));
            c += 1;
        }
    }
}
