package com.tanver.Competitive.leetcode.problems;

public class P509_FibonacciNumber {

    public int fib1(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        for (int i = 0; i < n - 1; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    // using dp
    public int fib2(int n) {
        return recursion(n, new Integer[n + 1]);
    }

    private int recursion(int n, Integer[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != null)
            return dp[n];
        return dp[n] = recursion(n - 1, dp) + recursion(n - 2, dp);
    }

    // 0 1 1 2 3 5 8
    public static void main(String[] args) {
        System.out.println(new P509_FibonacciNumber()
                .fib2(6));
    }

}
