package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class OverrideTest {

    OverrideTest(){
        this("call");
    }

    OverrideTest(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new OverrideTest();
    }
}
