package com.tanver;

import java.util.*;

public class Main {

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
                    return "Not Valid";
                char pop = stack.pop();
                if (pop != ch)
                    return "Not Valid";
            }
        }
        return stack.isEmpty() ? "Valid" : "Not Valid";
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
