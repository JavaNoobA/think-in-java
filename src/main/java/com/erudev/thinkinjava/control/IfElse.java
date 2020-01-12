package com.erudev.thinkinjava.control;

/**
 * Created by eru on 2020/1/9.
 */
public class IfElse {

    static int result = 0;
    static void test(int src, int target){
        if (src > target){
            result = +1;
        }else if (src < target){
            result = -1;
        }else {
            result = 0;
        }
    }

    public static void main(String[] args) {
        test(5 , 5);
        System.out.println(result);
        test(5 , 15);
        System.out.println(result);
        test(25 , 15);
        System.out.println(result);
    }
}
