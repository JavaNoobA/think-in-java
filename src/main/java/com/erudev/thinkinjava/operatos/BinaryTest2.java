package com.erudev.thinkinjava.operatos;

/**
 * >> 有符号操作符
 * >>> 无符号操作符
 * Created by eru on 2020/1/9.
 */
public class BinaryTest2 {
    public static void main(String[] args) {
        int i = 0xffff;
        System.out.println(Integer.toBinaryString(i));
        for (int j = 0; j < 16; j++) {
            i >>= 1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
