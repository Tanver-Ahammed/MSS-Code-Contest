package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] apples = new int[m];
        int[] oranges = new int[n];

        int numOfAppleInYards = 0;
        int numOfOrangeInYards = 0;

        for (int i = 0; i < apples.length; i++) {
            int temp = 0;
            apples[i] = scanner.nextInt();
            temp = a + apples[i];
            if (s <= temp && temp <= t)
                ++numOfAppleInYards;
        }

        for (int i = 0; i < oranges.length; i++) {
            int temp = 0;
            oranges[i] = scanner.nextInt();
            temp = b + oranges[i];
            if (s <= temp && temp <= t)
                ++numOfOrangeInYards;
        }
        System.out.println(numOfAppleInYards + "\n" + numOfOrangeInYards);
    }
}
