package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class Overflow {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int bigger = maxValue * 31111;
        System.out.println(bigger);
    }
}
