package com.erudev.thinkinjava.control;

/**
 * Created by eru on 2020/1/9.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++){
            if (Character.isLowerCase(c)){
                System.out.println("value:" + (int)c + " character:" + c);
            }
        }
    }
}
