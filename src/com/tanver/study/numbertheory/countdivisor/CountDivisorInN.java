package com.tanver.study.numbertheory.countdivisor;

import java.util.*;

public class CountDivisorInN {
    private static void printAndCountDivisor(int n) {
        Set<Integer> divisors = new TreeSet<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);
            }
        }
        System.out.println("Total Divisors: " + (divisors.size()));
        System.out.println(divisors);
    }

    public static void main(String[] args) {
        printAndCountDivisor(36);
    }
}
