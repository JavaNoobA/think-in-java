package com.erudev.thinkinjava.operatos;

/**
 * 如果对byte或short进行移位运算, 得到的可能不是正确的结果。它们会先被转换成Int型, 再进行右移操作, 然后被截断
 * 赋值给原来的类型, 在这种情况下可能得到-1的结果
 * Created by eru on 2020/1/9.
 */
public class URShift {
    public static void main(String[] args) {
        // short 16位 int 32位 long 64位
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 5;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 5;
        System.out.println("kkk" + l);
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        System.out.println(Integer.toBinaryString(s >>> 5));
        s >>>= 5;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 5;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 5));
    }
}
