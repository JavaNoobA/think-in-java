package com.erudev.thinkinjava.object;

/**
 * Created by eru on 2020/1/8.
 */
public class SingletonTest {
    private static SingletonTest instance;

    public SingletonTest() {
    }

    public static SingletonTest getInstance(){
        if (instance == null){
            return new SingletonTest();
        }
        return instance;
    }
}
