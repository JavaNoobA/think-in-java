package com.erudev.thinkinjava.object;

/**
 * Created by eru on 2020/1/8.
 * 创建一个类, 它包含一个Int域和char域, 它们没有被初始化,将它们
 * 的值打印出来,以验证Java执行默认初始化
 * int 初始化值是0,
 * char 初始化值没有赋值, 那么就是null <link>https://stackoverflow.com/questions/5859934/char-initial-value-in-java</link>
 */
public class PrimitiveTest {

    static int i;
    static char c;

    public static void main(String[] args) {
        System.out.println("int initialize=" + i);
        System.out.println("char initialize=" + c);
    }
}
