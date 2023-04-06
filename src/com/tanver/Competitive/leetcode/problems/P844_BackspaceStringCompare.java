package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P844_BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack1.isEmpty() && ch == '#')
                stack1.pop();
            else if (ch != '#')
                stack1.push(ch);
        }
        for (char ch : t.toCharArray()) {
            if (!stack2.isEmpty() && ch == '#')
                stack2.pop();
            else if (ch != '#')
                stack2.push(ch);
        }
        return stack1.equals(stack2);
    }

    public static void main(String[] args) {
        System.out.println(new P844_BackspaceStringCompare().backspaceCompare("y#fo##f", "y#f#o##f"));
        System.out.println(new P844_BackspaceStringCompare().backspaceCompare("ab##", "c#d#"));
        System.out.println(new P844_BackspaceStringCompare().backspaceCompare("a#c", "b"));
    }

}
