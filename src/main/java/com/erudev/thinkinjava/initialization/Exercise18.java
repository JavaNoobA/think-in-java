package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class Exercise18 {

    Exercise18(String s){
        System.out.println("Exercise18()" + s);
    }

    public static void main(String[] args) {
        Exercise18[] exercise = new Exercise18[11];
        for (int i = 0; i < exercise.length; i++) {
            exercise[i] = new Exercise18(String.valueOf(i));
        }
    }
}
