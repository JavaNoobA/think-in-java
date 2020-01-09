package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class TernaryTest {

    static int ternary(int val){
        return val < 10? val * 10: val * 100;
    }

    static int standardIfElse(int val){
        if (val < 10){
            return val * 10;
        }else {
            return val * 100;
        }
    }

    public static void main(String[] args) {
        ternary(20);
        standardIfElse(20);
    }
}
