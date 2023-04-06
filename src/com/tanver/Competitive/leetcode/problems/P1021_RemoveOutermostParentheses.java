package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P1021_RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push('(');
            else {

            }
        }
        return "";
    }

    public static void main(String[] args) {

    }

}
