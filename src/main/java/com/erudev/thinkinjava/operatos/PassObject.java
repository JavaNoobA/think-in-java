package com.erudev.thinkinjava.operatos;

/**
 * Created by eru on 2020/1/8.
 */
class Letter{
    char c;
}

public class PassObject {

    static void f(Letter letter){
        letter.c = 'z';
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.c = 'a';
        System.out.println("letter.c = " + letter.c);

        f(letter);
        System.out.println("letter.c = " + letter.c);
    }
}
