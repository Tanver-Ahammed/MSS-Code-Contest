package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

public class HackerRankInString {
    private static void isHackerrank(String hackString) {
        char[] hack = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};

        int index = 0;
        for (char ch : hackString.toCharArray()) {
            if (ch == hack[index]) {
                ++index;
            }
            if (index == 10)
                break;
        }
        if (index == 10)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String hackString = scanner.next();
            isHackerrank(hackString);
        }
    }
}
