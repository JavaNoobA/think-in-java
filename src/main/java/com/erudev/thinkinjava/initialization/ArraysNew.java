package com.erudev.thinkinjava.initialization;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by eru on 2020/1/12.
 */
public class ArraysNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random();
        a = new int[random.nextInt(24)];
        System.out.println("length of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
