package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int n = scanner.nextInt();

        int len = Math.min(s.length(), t.length());
        int index = 0;
        while (index < len) {
            if (t.charAt(index) == s.charAt(index)) {
                ++index;
            } else
                break;
        }

        int delete = s.length() - index;
        int append = t.length() - index;
        int operations = delete + append;

        if (operations <= n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
