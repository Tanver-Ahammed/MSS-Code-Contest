package com.tanver.Competitive.codeforces.practice.ProblemSet;

import java.util.Scanner;

public class A_742 {
    private static void findLastDigit(int power, int base, int mod) {
        int result = 1;
        while (power != 0) {
            if (power % 2 == 0) {
                base = (base * base) % mod;
                power /= 2;
            } else {
                result = (result * base) % mod;
                power--;
            }
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        findLastDigit(power, 8, 10);
    }
}

