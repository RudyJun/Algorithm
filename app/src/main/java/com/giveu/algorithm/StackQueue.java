package com.giveu.algorithm;

import java.util.Stack;

/**
 * Created by 513419 on 2017/12/28.
 * 编写一个类，用两个栈实现队列，支持队列的基本操作(add、poll、peek)。
 */

public class StackQueue {
    private Stack<Integer> oStack = new Stack<>();
    private Stack<Integer> cStack = new Stack<>();

    public void add(Integer integer) {
        oStack.add(integer);
    }

    public Integer poll() {
        if (oStack.isEmpty() && cStack.isEmpty()) {
            throw new RuntimeException("StackQueue is empty");
        } else if (cStack.isEmpty()) {
            while (!oStack.isEmpty()) {
                cStack.push(oStack.pop());
            }
        }
        return cStack.pop();
    }

    public Integer peek() {
        if (oStack.isEmpty() && cStack.isEmpty()) {
            throw new RuntimeException("StackQueue is empty");
        } else if (cStack.isEmpty()) {
            while (!oStack.isEmpty()) {
                cStack.push(oStack.pop());
            }
        }
        return cStack.peek();
    }

    @Override
    public String toString() {
        return cStack.toString();
    }
}
