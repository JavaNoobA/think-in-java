package com.erudev.thinkinjava.object;

/**
 * Created by eru on 2020/1/8.
 */
public class ATNTest {

    static class ATypeName {
        int i;
        double d;
        boolean b;
        void show(){
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();

    }
}
