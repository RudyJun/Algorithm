package com.giveu.algorithm;

/**
 * Created by 513419 on 2017/12/25.
 * 顺序查找
 */

public class SequenceSearch {
    public static int solution(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
