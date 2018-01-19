package com.giveu.algorithm;

import java.util.Stack;

/**
 * Created by 513419 on 2017/12/28.
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，在实现返回栈中最小元素的操作。
 * 要求：
 * pop、push、getMin操作的时间复杂度都是O(1)
 * 设计的栈类型可以使用现成的栈结构
 */

public class MinStack {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(Integer value) {
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else if (value <= getMin()) {
            minStack.push(value);
        }
        dataStack.push(value);
    }

    public Integer pop() {
        Integer num = dataStack.pop();
        if (num.equals(getMin())) {
            minStack.pop();
        }
        return num;
    }

    public Integer getMin() {
        if (minStack == null) {
            throw new RuntimeException("minStack is empty");
        }
        return minStack.peek();
    }

}
