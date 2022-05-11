package com.tanver.study.numbertheory;

import java.util.Scanner;

public class UVA_10699CountFactors {
    private static void countPrimeFactors(int n) {
        int temp = n;
        int count = 0;
        for (int i = 2; i <= Math.sqrt(temp); i++) {
            if (temp % i == 0) {
                ++count;
                while (temp % i == 0) {
                    temp /= i;
                }
            }
        }
        if (temp > 1)
            ++count;
        System.out.println(n + " : " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break;
            countPrimeFactors(n);
        }
    }
}
