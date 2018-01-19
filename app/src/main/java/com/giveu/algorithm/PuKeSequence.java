package com.giveu.algorithm;

import java.util.Arrays;

/**
 * Created by 513419 on 2017/12/29.
 */

public class PuKeSequence {
    public static boolean solution(int[] number) {
        if (number == null) {
            return false;
        }
        Arrays.sort(number);
        int gap = 0;
        int zeroCount = 0;
        for (int i = 0; i < number.length && number[i] == 0; i++) {
            zeroCount++;
        }
        for (int i = zeroCount; i < number.length - 1; i++) {
            if (number[i + 1] == number[i]) {
                return false;
            }
            gap = number[i + 1] - number[i] - 1;
        }
        return gap <= zeroCount;
    }
}
