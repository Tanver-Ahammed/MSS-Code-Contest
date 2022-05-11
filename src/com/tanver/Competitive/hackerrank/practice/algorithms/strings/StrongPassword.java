package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCharacter = scanner.nextInt();
        String password = scanner.next();
        int number = 0, lower_case = 0, upper_case = 0, special_characters = 0;
        for (char ch : password.toCharArray()) {
            if (('0' <= ch && ch <= '9') && number == 0) {
                ++number;
            } else if (('a' <= ch && ch <= 'z') && lower_case == 0) {
                ++lower_case;
            } else if (('A' <= ch && ch <= 'Z') && upper_case == 0) {
                ++upper_case;
            } else if ((ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^'
                    || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+') && special_characters == 0) {
                ++special_characters;
            }
        }
        int sumOfCondition = number + lower_case + upper_case + special_characters;
        if (sumOfCondition == 4 && numberOfCharacter >= 6)
            System.out.println(0);
        else {
            int lackOfCharacter = 6 - numberOfCharacter;
            int lackOfCondition = 4 - sumOfCondition;
            System.out.println(Math.max(lackOfCharacter, lackOfCondition));
        }
    }
}


/*
numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"
* */