package com.tanver.study.apna.college.graph.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class Backtracking {

    private static void printPermutation(String str, String permutation) {
        if (str.isEmpty()) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        /**
         * Write your Java code from here
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = new String(charArray);
        printPermutation(str, "");

    }

}
