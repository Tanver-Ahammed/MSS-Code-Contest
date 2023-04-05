package com.tanver.Competitive.leetcode.problems;

public class P1137_NthTribonacciNumber {

    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n < 3)
            return 1;
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        int t4 = 0;
        for (int i = 0; i < n - 2; i++) {
            t4 = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = t4;
        }
        return t4;
    }

    public static void main(String[] args) {
        System.out.println(new P1137_NthTribonacciNumber().tribonacci(4));
    }

}
