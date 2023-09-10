package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class P150_EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        int a;
        int b;
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                }
                case "*" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                }
                case "/" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                }
                case "-" -> {
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(new P150_EvaluateReversePolishNotation()
                .evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }

}
