package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P1614_MaximumNestingDepthOfTheParentheses {

    public int maxDepth1(String s) {
        Stack<Character> stack = new Stack<>();
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
                if (stack.size() > max)
                    max = stack.size();
            } else if (ch == ')')
                stack.pop();
        }
        return max;
    }

    public int maxDepth2(String s) {
        int max = 0;
        int size = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                ++size;
                if (size > max)
                    max = size;
            } else if (ch == ')')
                --size;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new P1614_MaximumNestingDepthOfTheParentheses().maxDepth1("(1+(2*3)+((8)/4))+1"));
        System.out.println(new P1614_MaximumNestingDepthOfTheParentheses().maxDepth1("(1)+((2))+(((3)))"));

        System.out.println(new P1614_MaximumNestingDepthOfTheParentheses().maxDepth2("(1+(2*3)+((8)/4))+1"));
        System.out.println(new P1614_MaximumNestingDepthOfTheParentheses().maxDepth2("(1)+((2))+(((3)))"));

    }

}
