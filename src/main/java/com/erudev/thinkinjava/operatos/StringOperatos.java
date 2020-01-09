package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/9.
 */
public class StringOperatos {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        // 如果表达式以一个字符串起头, 那么后续所有操作数都必须是字符串型(编译器会把双引号内的字符序列自动转成字符串)
        System.out.println(x + y + z + s);
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) =";
        System.out.println(s + (x + y + z));
        System.out.println("" + x);
    }
}
