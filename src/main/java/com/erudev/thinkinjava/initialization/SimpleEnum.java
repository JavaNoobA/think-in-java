package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class SimpleEnum {
    public static void main(String[] args) {
        System.out.println(SeasonEnum.SPRING);

        SeasonEnum[] values = SeasonEnum.values();
        for (SeasonEnum val: values){
            System.out.println(val.ordinal() + " " + val.name());
        }
    }
}
