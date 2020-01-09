package com.erudev.thinkinjava.operatos;

import static com.erudev.thinkinjava.net.mindview.util.Print.*;

/**
 * Created by eru on 2020/1/8.
 * 由于赋值操作的是一个对象的引用, 所以修改t1的同时也改变了t2;
 * <b>在对t1赋值的时候, 这个引用被覆盖, 也就是丢失了, 而那个不再被引用的对象会由"垃圾回收器"自动清理 !!!</b>
 */
class Tank{
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1: t1 level = " + t1.level + " t2 level = " + t2.level);
        t1 = t2;
        print("2: t1 level = " + t1.level + " t2 level = " + t2.level);
        t1.level = 27;
        print("3: t1 level = " + t1.level + " t2 level = " + t2.level); // t1.level=27, t2.level=27
    }
}
