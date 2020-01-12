package com.erudev.thinkinjava.initialization;

import java.util.stream.Stream;

/**
 * Created by eru on 2020/1/12.
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] a1 = {1, 2 ,3 ,4 , 5};
        int[] a2;
        a2 = a1;

        for (int i = 0; i < a2.length; i++) {
            a2[i] = a1[i] + 1;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println("a1[" + i + "] = " + a1[i]);
        }
    }
}
