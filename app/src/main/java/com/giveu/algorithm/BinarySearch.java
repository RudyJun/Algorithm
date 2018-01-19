package com.giveu.algorithm;

/**
 * Created by 513419 on 2017/12/25.
 * 折半查找
 * 基本原理：每次查找都对半分，但要求数组是有序的
 */

public class BinarySearch {
    public static int solution(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
