package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1:" + Integer.toBinaryString(i1)); // Hexadecimal lowercase 十六进制
        int i2 = 0x2F;
        System.out.println("i2:" + Integer.toBinaryString(i2)); // Hexadecimal uppercase 十六进制
        int i3 = 0177;
        System.out.println("i3:" + Integer.toBinaryString(i3)); // Octal 八进制
        char c = 0xffff;
        System.out.println("c:" + Integer.toBinaryString(c)); // max char hex value
        byte b = 0x7f;
        System.out.println("b:" + Integer.toBinaryString(b)); // max byte hex value
        short s = 0x7fff;
        System.out.println("s:" + Integer.toBinaryString(s)); // max short hex value

    }
}
