package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class Leaf {

    int i;

    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().print(); // increment()通过this关键字返回了对当前对象的引用, 所以很容易在一条语句中对同一对象执行多次
    }
}
