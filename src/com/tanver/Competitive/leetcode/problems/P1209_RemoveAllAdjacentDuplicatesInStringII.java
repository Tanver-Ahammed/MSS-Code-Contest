package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P1209_RemoveAllAdjacentDuplicatesInStringII {

    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> counterStack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.size() > 0 && stack.peek() == ch)
                counterStack.push(counterStack.peek() + 1);
            else
                counterStack.push(1);
            stack.push(ch);
            if (counterStack.peek() == k) {
                for (int i = 0; i < k; i++) {
                    stack.pop();
                    counterStack.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (stack.size() > 0)
            sb.append(stack.pop());
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new P1209_RemoveAllAdjacentDuplicatesInStringII()
                .removeDuplicates("deeedbbcccbdaa", 3));
    }

}
