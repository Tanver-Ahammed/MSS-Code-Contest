package com.tanver.Competitive.leetcode.problems;

public class P70_ClimbingStairs {

    public int climbStairs1(int n) {
        if (n == 1)
            return 1;
        if (n == 2) return 2;
        int[] a = new int[n];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2; i < n; i++)
            a[i] = a[i - 1] + a[i - 2];
        return a[n - 1];
    }

    public int climbStairs2(int n) {
        int[] count = new int[n + 1];
        return calculateSteps(n, count);
    }

    public int calculateSteps(int n, int[] count) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (count[n] > 0)
            return count[n];
        count[n] = calculateSteps(n - 1, count) + calculateSteps(n - 2, count);
        return count[n];
    }

    public static void main(String[] args) {
        System.out.println(new P70_ClimbingStairs().climbStairs1(45));
        System.out.println(new P70_ClimbingStairs().climbStairs2(45));
    }

}
