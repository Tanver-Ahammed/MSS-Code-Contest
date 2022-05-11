package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class HalloweenSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        int sum = 0;
        int count = 0;
        while (sum < s) {
            sum = sum + p;
            if (sum > s)
                break;
            ++count;
            if (p > m)
                p = p - d;
            if (p < m)
                p = m;
        }
        System.out.println(count);
    }
}
