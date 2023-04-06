package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P1544_MakeTheStringGreat {

    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32)
                stack.pop();
            else
                stack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stack)
            sb.append(ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P1544_MakeTheStringGreat().makeGood("lEeeetcode"));
        System.out.println(new P1544_MakeTheStringGreat().makeGood("lEeeEeetcode"));
    }

}
