package com.tanver.Competitive.ostad.app.stack.queue;

import java.util.Stack;

public class AssignmentOnStackAndQueue {

    public String removeAdjacentDuplicates(String s) {
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

}
