package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals){
        petalCount = petals;
        System.out.println("Construct w/ int ary only, petalCouunt");
    }

    Flower(String ss){
        s = ss;
        System.out.println("Construct /w string arg only, s =" + ss);
    }

    Flower(int petals, String ss){
        this(petals);
        //this(ss); can't call two
        this.s = ss;
        System.out.println("string & int arg");
    }

    Flower(){
        this(24, "hello"); // 必须在第一行
        System.out.println("no args");
    }

    void printPetalCount(){
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
