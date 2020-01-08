package com.erudev.thinkinjava.object;

/**
 * Created by eru on 2020/1/8.
 */
public class ArgsTest {
    public static void main(String[] args) {
        if (args.length == 3){
            String argStr = String.format("arg1={}, arg2={}, arg3={}", args[0], args[1], args[2]);
            System.out.println(argStr);
        }
    }
}
