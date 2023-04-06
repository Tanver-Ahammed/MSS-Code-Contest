package com.tanver.Competitive.leetcode.problems;

import java.util.List;
import java.util.Stack;

class MinStack {

    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty())
            minStack.add(val);
        else
            minStack.add(Math.min(val, minStack.get(minStack.size() - 1)));
        this.stack.add(val);
    }

    public void pop() {
        this.stack.remove(stack.size() - 1);
        this.minStack.remove(minStack.size() - 1);
    }

    public int top() {
        return this.stack.get(stack.size() - 1);
    }

    public int getMin() {
        return this.minStack.get(minStack.size() - 1);
    }
}

public class P155_MinStack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(50);
        stack.push(21);
        stack.push(68874);
        stack.push(23);
        stack.push(87);
        stack.pop();
        System.out.println();
    }
}
