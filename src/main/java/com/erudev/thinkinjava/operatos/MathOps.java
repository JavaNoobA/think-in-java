package com.erudev.thinkinjava.operatos;

import java.util.Random;

import static com.erudev.thinkinjava.net.mindview.util.Print.*;

/**
 * Created by eru on 2020/1/8.
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        print("j :" + j);
        k = rand.nextInt(100) + 1;
        print("k :" + k);
        i = j + k;
        print("j + k :" + i);
        i = j - k;
        print("j - k :" + i);
        i = k / j;
        print("j / k :" + i);
    }
}
