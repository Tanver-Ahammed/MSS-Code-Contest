package com.tanver.study.numbertheory.fibonaccinumber;

public class FibonacciNumber {
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
        int n = 40;
        long start = 0, end = 0;
        start = System.nanoTime();
        solve(0, 1, n);
        end = System.nanoTime();
        System.out.println(end - start);

        start = System.nanoTime();
        nthFib(n);
        end = System.nanoTime();
        System.out.println(end - start);

    }

    private static void nthFib(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;
        for (int i = 0; i < n - 2; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);
    }
}
