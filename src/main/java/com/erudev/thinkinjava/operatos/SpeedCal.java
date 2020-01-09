package com.erudev.thinkinjava.operatos;

import static com.erudev.thinkinjava.net.mindview.util.Print.print;

/**
 * Created by eru on 2020/1/8.
 */
public class SpeedCal {
    static float distance = 5.32f;
    static float time = 30 * 60;

    public static void main(String[] args) {
        print("speed = "  + distance/time);
    }
}
