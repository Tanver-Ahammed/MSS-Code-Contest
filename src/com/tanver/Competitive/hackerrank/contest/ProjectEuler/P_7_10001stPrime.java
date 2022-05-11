  package com.tanver.Competitive.hackerrank.contest.ProjectEuler;

import java.util.Scanner;

public class P_7_10001stPrime {
    private static void nthPrimeNumber(int n) {
        int MAX_SIZE = 105000;
        boolean[] primeList = new boolean[MAX_SIZE + 1];
        for (int i = 0; i < MAX_SIZE; i++) {
            primeList[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(MAX_SIZE); i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= MAX_SIZE; j += i) {
                    primeList[j] = false;
                }
            }
        }

        int temp = 0;
        for (int i = 2; i <= MAX_SIZE; i++) {
            if (primeList[i]) {
                ++temp;
                if (temp == n) {
                    System.out.println(i);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            nthPrimeNumber(number);
        }
    }
}
