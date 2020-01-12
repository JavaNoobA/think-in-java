package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class InitialValues {
    boolean b;
    char c;
    byte by;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues(){
        System.out.println("Data type Initial value");
        System.out.println("boolean              " + b);
        System.out.println("byte                 " + by);
        System.out.println("char                 " + c);
        System.out.println("short                " + s);
        System.out.println("int                  " + i);
        System.out.println("long                 " + l);
        System.out.println("float                " + f);
        System.out.println("double               " + d);
        System.out.println("InitialValues        " + reference);
    }

    public static void main(String[] args) {
        InitialValues initialValues = new InitialValues();
        initialValues.printInitialValues();
    }
}
