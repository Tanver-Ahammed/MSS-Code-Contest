package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P1047_RemoveAllAdjacentDuplicatesInString {


    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch)
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
        System.out.println(new P1047_RemoveAllAdjacentDuplicatesInString().removeDuplicates("abbaca"));
    }

}
