package com.tanver.Competitive.ostad.app.stack.queue;

import java.util.Scanner;
import java.util.Stack;

public class ValidBracketSequence {

    private static String isValidBracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else {
                if (stack.isEmpty())
                    return "Not valid";
                char pop = stack.pop();
                if (pop != ch)
                    return "Not valid";
            }
        }
        return stack.isEmpty() ? "Valid" : "Not valid";
    }

    public static void main(String[] args) {
        /**
         * Write your Java code from here
         */
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String s = scanner.next();
            System.out.println(isValidBracket(s));
        }
    }

}
