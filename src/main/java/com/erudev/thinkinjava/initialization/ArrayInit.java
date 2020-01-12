package com.erudev.thinkinjava.initialization;

import java.util.Arrays;

/**
 * Created by eru on 2020/1/12.
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(3),
                new Integer(4),
                5
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
