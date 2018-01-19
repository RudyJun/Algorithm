package com.giveu.algorithm;

import java.util.Arrays;

/**
 * Created by 513419 on 2017/12/25.
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * 大意：将一个字符串按锯型排列并返回所有行的结果相加值
 */

public class ZigZag {
    public static String solution(String original, int rows) {
        String result = "";
        if (original == null || original.length() == 0 || rows == 1) {
            return original;
        }
        int currentRow = 0;
        int delta = 1;
        String[] rowArray = new String[rows];
        Arrays.fill(rowArray,"");
        for (int i = 0; i < original.length(); i++) {
            rowArray[currentRow] += original.charAt(i);
            if (currentRow == rows - 1) {
                delta = -1;
            } else if (currentRow == 0) {
                delta = 1;
            }
            currentRow += delta;
        }
        for (int i = 0; i < rows; i++) {
            result += rowArray[i];
        }
        return result;
    }
}
