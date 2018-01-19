package com.giveu.algorithm;

import java.util.Stack;

/**
 * Created by 513419 on 2017/12/28.
 * 一个栈一次压入了1、2、3、4、5，那么从栈顶到栈底分别为5、4、3、2、1.将这个栈转置后，
 * 从栈顶到栈底为1、2、3、4、5，
 * 也就是实现栈中元素的逆序，但是只能用递归函数来实现，不能用其他数据结构。
 */

public class ReverseStack extends Stack<Integer> {
    public void reverse() {
        if (isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement();
        reverse();
        push(i);
    }

    public int getAndRemoveLastElement() {
        int result = pop();
        if (isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement();
            push(result);
            return last;
        }
    }

}
