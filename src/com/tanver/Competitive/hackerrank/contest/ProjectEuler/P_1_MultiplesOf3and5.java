package com.tanver.Competitive.hackerrank.contest.ProjectEuler;

import java.math.BigInteger;
import java.util.Scanner;

public class P_1_MultiplesOf3and5 {
    private static void multiple3or5Sum(int n) {
        int MAX = n;
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 3; i < MAX; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum = sum.add(BigInteger.valueOf(i));
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            multiple3or5Sum(n);
        }
    }
}