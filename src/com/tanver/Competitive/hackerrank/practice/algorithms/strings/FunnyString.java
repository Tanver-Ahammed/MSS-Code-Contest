package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String funnyString = scanner.next();
            int[] chars = new int[funnyString.length() - 1];

            for (int i = 0; i < chars.length; i++) {
                chars[i] = Math.abs(funnyString.charAt(i) - funnyString.charAt(i + 1));
            }

            boolean flag = false;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] == chars[chars.length - 1 - i]) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("Funny");
            else System.out.println("Not Funny");
        }
    }
}