package com.tanver.Competitive.ostad.app.recursion;

public class FibonacciProblems {

    private int recursion(int n, Integer[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != null)
            return dp[n];
        return dp[n] = recursion(n - 1, dp) + recursion(n - 2, dp);

    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(new FibonacciProblems().recursion(n, new Integer[n + 1]));
    }

}
