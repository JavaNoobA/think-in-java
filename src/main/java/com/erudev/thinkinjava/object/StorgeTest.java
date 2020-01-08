package com.erudev.thinkinjava.object;

/**
 * Created by eru on 2020/1/8.
 */
public class StorgeTest {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }
        StoreStuff x = new StoreStuff();
        System.out.println(x.storage("hi"));
    }
}
