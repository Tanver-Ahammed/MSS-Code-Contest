package com.tanver.Competitive.hackerrank.practice.mathematics.numberTheory;

import java.util.Scanner;

public class FibonacciFindingEasy {

    private static long[][] matrixMultiply(long[][] matrix1, long[][] matrix2) {
        long[][] result = new long[matrix1.length][matrix2[0].length];
        int mod = 1000000000;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    long x = (matrix1[i][k] * matrix2[k][j]) % mod;
                    result[i][j] = (result[i][j] + x) % mod;
                }
            }
        }
        return result;
    }

    private static void solve(long a, long b, long n) {
        long[][] I = new long[2][2];
        long[][] T = new long[2][2];

        I[0][0] = I[1][1] = 1;
        I[0][1] = I[1][0] = 0;

        T[0][0] = 0;
        T[0][1] = T[1][0] = T[1][1] = 1;

        n--;

        while (n != 0) {
            if (n % 2 == 0) {
                T = matrixMultiply(T, T);
                n = n / 2;
            } else {
                I = matrixMultiply(T, I);
                n--;
            }
        }
        long ans = (a * I[0][1] + b * I[1][0]);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            solve(a, b, n);
        }
    }
}

