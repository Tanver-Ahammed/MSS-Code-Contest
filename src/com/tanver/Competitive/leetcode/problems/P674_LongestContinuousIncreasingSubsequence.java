package com.tanver.Competitive.leetcode.problems;

public class P674_LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int counter = 1;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                ++counter;
                if (counter > max)
                    max = counter;
            } else {
                counter = 1;
                ++result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P674_LongestContinuousIncreasingSubsequence()
                .findLengthOfLCIS(new int[]{2, 2, 2, 2, 2, 2, 2}));
    }

}
