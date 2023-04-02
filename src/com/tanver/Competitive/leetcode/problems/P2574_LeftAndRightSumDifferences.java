package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2574_LeftAndRightSumDifferences {

    public int[] leftRigthDifference(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 1; i < len; i++)
            left[i] = left[i - 1] + nums[i - 1];
        for (int i = len - 2; i >= 0; i--)
            right[i] = right[i + 1] + nums[i + 1];
        for (int i = 0; i < len; i++)
            nums[i] = Math.abs(left[i] - right[i]);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2574_LeftAndRightSumDifferences()
                .leftRigthDifference(new int[]{10, 4, 8, 3})));
    }

}
