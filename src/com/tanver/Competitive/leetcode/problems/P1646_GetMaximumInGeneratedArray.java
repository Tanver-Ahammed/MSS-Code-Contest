package com.tanver.Competitive.leetcode.problems;

public class P1646_GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        int max = 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                dp[i] = dp[i / 2];
            else
                dp[i] = dp[i / 2] + dp[i / 2 + 1];
            if (dp[i] > max)
                max = dp[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new P1646_GetMaximumInGeneratedArray().getMaximumGenerated(25));
    }

}
