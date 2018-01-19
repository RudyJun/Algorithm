package com.giveu.algorithm.test;

import com.giveu.algorithm.BinarySearch;
import com.giveu.algorithm.MinStack;
import com.giveu.algorithm.PrintNNumber;
import com.giveu.algorithm.PuKeSequence;
import com.giveu.algorithm.ReverseStack;
import com.giveu.algorithm.SequenceSearch;
import com.giveu.algorithm.StackQueue;
import com.giveu.algorithm.TwoSum;
import com.giveu.algorithm.ZigZag;

import java.util.Arrays;

/**
 * Created by 513419 on 2017/12/25.
 * 编写一个类，用两个栈实现队列，支持队列的基本操作(add、poll、peek)。
 */

public class AlgorithmTest {
    public static void main(String[] args) {
        //测试TwoSum
        int[] indexResult = TwoSum.solution(new int[]{2, 4, 3, 6, 9}, 8);
        System.out.println(Arrays.toString(indexResult));

        //测试ZigZag
        String zigZagResult = ZigZag.solution("PAYPALISHIRING", 4);
        String zigZagResult2 = ZigZag.solution("PAYPALISHIRING", 3);
        System.out.println(zigZagResult);
        System.out.println(zigZagResult2);

        //顺序查找
        System.out.println(SequenceSearch.solution(new int[]{3, 2, 8, 7, 9}, 8));

        //折半查找
        System.out.println(BinarySearch.solution(new int[]{3, 2, 8, 7, 9}, 9));

        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(6);
        stack.push(2);
        stack.push(2);
        System.out.println("栈内最小的数" + stack.getMin());
        stack.pop();
        System.out.println("栈内最小的数" + stack.getMin());

        StackQueue queue = new StackQueue();
        queue.add(3);
        queue.add(4);
        queue.add(2);
        queue.add(1);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        ReverseStack reverseStack = new ReverseStack();
        reverseStack.add(5);
        reverseStack.add(4);
        reverseStack.add(3);
        reverseStack.add(2);
        reverseStack.add(1);
        System.out.println(reverseStack);
        reverseStack.reverse();
        System.out.println(reverseStack);

        PrintNNumber.Print1ToMaxOfNDigits_2(3);

        boolean isSequence = PuKeSequence.solution(new int[]{1, 0, 2, 0, 6});
        System.out.println("是否顺子：" + isSequence);

    }
}
