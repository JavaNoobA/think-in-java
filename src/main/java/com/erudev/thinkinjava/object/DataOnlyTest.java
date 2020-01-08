package com.erudev.thinkinjava.object;

/**
 * Created by eru on 2020/1/8.
 */
public class DataOnlyTest {

    static class DataOnly {
        int i;
        double d;
        boolean b;
        void show() {
            System.out.println(i);
            System.out.println(d);
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 3;
        data.d = 2.71828;
        data.b = false;
        data.show();
    }
}
