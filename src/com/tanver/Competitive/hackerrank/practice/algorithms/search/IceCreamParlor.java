package com.tanver.Competitive.hackerrank.practice.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            aa:
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == m) {
                        System.out.println(++i + " " + ++j);
                        break aa;
                    }
                }
            }
        }
    }
}
