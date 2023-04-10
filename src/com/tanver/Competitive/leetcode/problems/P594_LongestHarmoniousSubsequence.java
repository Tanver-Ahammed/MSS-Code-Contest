package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P594_LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int max = 0;
        while (right < nums.length) {
            while (nums[right] - nums[left] > 1)
                left++;
            if (nums[right] - nums[left] == 1)
                max = Math.max(max, (right - left) + 1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new P594_LongestHarmoniousSubsequence()
                .findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }

}
