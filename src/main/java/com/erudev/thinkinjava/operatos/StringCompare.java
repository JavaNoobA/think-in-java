package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class StringCompare {

    static void f(boolean b){
        if (b == true){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    static void stringTest(String one, String two){
        f(one == two);
        f(one.equals(two));
        f(two.equals(one));
        f(one != two);
        //f(!one);
    }

    public static void main(String[] args) {

    }
}
