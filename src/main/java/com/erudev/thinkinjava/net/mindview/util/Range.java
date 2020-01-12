package com.erudev.thinkinjava.net.mindview.util;

/**
 * Created by eru on 2020/1/12.
 */
public class Range {
    /**
     * 生成一个定长的数组
     * @param num 长度
     * @return 数组
     */
    public static int[] range(int num){
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = i;
        }
        return result;
    }

    /**
     * 生成一个有起始、结束的数组
     * @param start 开始
     * @param end  结束
     * @return 数组
     */
    public static int[] range(int start, int end){
        int len = end - start + 1;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = start + i;
        }
        return result;
    }

    /**
     * 生成一个带步长的数组
     * @param start 开始
     * @param end 结束
     * @param step 步长
     * @return 数组
     */
    public static int[] range(int start, int end, int step){
        int len = end - start + 1;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = start + (i * step);
        }
        return result;
    }
}
