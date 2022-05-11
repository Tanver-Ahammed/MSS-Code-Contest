package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            long height = 1;

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0)
                    height *= 2;
                else
                    height += 1;
            }
            System.out.println(height);
        }
    }
}
