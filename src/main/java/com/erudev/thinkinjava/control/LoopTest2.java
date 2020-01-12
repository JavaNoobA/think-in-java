package com.erudev.thinkinjava.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by eru on 2020/1/12.
 */
public class LoopTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 25; i++) {
            list.add(random.nextInt(100));
        }
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)){
                System.out.println("在先=" + list.get(i) + "大于 在后=" + list.get(i +1));
            }else if (list.get(i) < list.get(i + 1 )){
                System.out.println("在先=" + list.get(i) + "小于 在后=" + list.get(i +1));
            }else {
                System.out.println("在先=" + list.get(i) + "等于 在后=" + list.get(i +1));
            }
        }
    }
}
