package com.tanver.Competitive.hackerrank.practice.java;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String expression = scanner.next();
            if (isValid(expression))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }

    private static boolean isValid(String expression) {
        int len = expression.length();
        if (8 > len || len > 30)
            return false;
        else if (!Character.isLetter(expression.charAt(0)))
            return false;
        else {
            for (char ch : expression.toCharArray()) {
                if (Character.isLetter(ch) || Character.isDigit(ch) || (ch == '_')) continue;
                else
                    return false;
            }
        }
        return true;
    }
}
