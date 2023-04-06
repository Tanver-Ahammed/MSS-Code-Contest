package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P2390_RemovingStarsFromAString {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*')
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
        System.out.println(new P2390_RemovingStarsFromAString().removeStars("leet**cod*e"));
        System.out.println(new P2390_RemovingStarsFromAString().removeStars("erase*****"));
    }

}
