package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.7f;
        System.out.println("(Round)above=" + Math.round(above));
        System.out.println("(Round)below=" + Math.round(below));
        System.out.println("(Round)fabove=" + Math.round(fabove));
        System.out.println("(Round)fbelow=" + Math.round(fbelow));
    }
}
