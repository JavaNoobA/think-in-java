package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class DefaultContruct {
    DefaultContruct(){
        System.out.println("initialize");
    }

    DefaultContruct(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        new DefaultContruct();
        new DefaultContruct("aaa");
    }
}
