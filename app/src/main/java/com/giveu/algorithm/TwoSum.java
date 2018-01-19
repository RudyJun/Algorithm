package com.giveu.algorithm;

import java.util.HashMap;

/**
 * Created by 513419 on 2017/12/25.
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 大意：给定一个数组和一个目标值，在数组中查找两个下标对应的值的和为目标值，可以假设每次输入都只有一个解
 */

public class TwoSum {
    public static int[] solution(int[] numbers, int target) {
        HashMap<Integer, Integer> searchMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (searchMap.get(numbers[i]) != null) {
                int[] result = {searchMap.get(numbers[i]) + 1, i + 1};
                return result;
            } else {
                searchMap.put(target - numbers[i], i);
            }
        }
        int[] result = {};
        return result;
    }
}
