package com.legend.easyexcel;

import java.util.Stack;

/**
 * 栈的演示
 *
 * @author legend
 * @version 1.0
 * @description
 * @date 2021/6/6
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //第一个为栈顶
        stack.push("jack");
        stack.push("tom");
        stack.push("smith");
        stack.push("legend");

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }
    }
}
