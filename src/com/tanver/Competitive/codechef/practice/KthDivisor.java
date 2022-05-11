package com.tanver.Competitive.codechef.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KthDivisor {
    private static long kthDivisor(long n, int k) {
        Set<Long> divisorsSet = new TreeSet<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisorsSet.add(i);
                divisorsSet.add(n / i);
            }
        }
        int index = 0;
        for (Long x : divisorsSet) {
            ++index;
            if (index == k)
                return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int k = scanner.nextInt();
        System.out.println(kthDivisor(n, k));
    }
}
