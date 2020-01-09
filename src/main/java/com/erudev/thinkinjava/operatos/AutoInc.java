package com.erudev.thinkinjava.operatos;

import static com.erudev.thinkinjava.net.mindview.util.Print.print;

/**
 * Created by eru on 2020/1/8.
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        print("i :" + i);      // 1
        print("++i :" + ++i);  // 2
        print("i++ :" + i++);  // 2
        print("i :" + i);      // 3
        print("--i :" + --i);  // 2
        print("i-- :" + i--);  // 2
        print("i :" + i);      // 1
    }
}
