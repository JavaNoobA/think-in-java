package com.erudev.thinkinjava.control;

import static com.erudev.thinkinjava.net.mindview.util.Range.*;

/**
 * Created by eru on 2020/1/12.
 */
public class ForeachInt {
    public static void main(String[] args) {
        for (int i: range(10)) {
            System.out.println(i);
        }

        for (int i: range(5, 100)){
            System.out.println(i);
        }

        for (int i: range(5, 100, 20)){
            System.out.println(i);
        }
    }
}
