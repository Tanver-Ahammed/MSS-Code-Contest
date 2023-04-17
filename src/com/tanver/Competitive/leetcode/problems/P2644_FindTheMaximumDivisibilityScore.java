package com.tanver.Competitive.leetcode.problems;

public class P2644_FindTheMaximumDivisibilityScore {

    public int maxDivScore(int[] nums, int[] divisors) {
        int resultDivisor = Integer.MAX_VALUE;
        int max = -1;
        for (int div : divisors) {
            int counter = 0;
            for (int num : nums) {
                if (num % div == 0)
                    ++counter;
            }
            if ((counter > max) || (counter == max && div < resultDivisor)) {
                max = counter;
                resultDivisor = div;
            }
        }
        return resultDivisor;
    }

    public static void main(String[] args) {
        System.out.println(new P2644_FindTheMaximumDivisibilityScore()
                .maxDivScore(new int[]{12}, new int[]{10, 16}));
    }

}
