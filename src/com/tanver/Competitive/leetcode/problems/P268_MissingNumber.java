package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P268_MissingNumber {

    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int prev = 0;
        for (int i = 0; i < len; i++) {
            if (prev != nums[i])
                return prev;
            prev++;
        }
        return len;
    }

    public int missingNumber2(int[] nums) {
        int sum = 0;
        boolean g = 10 % 0 == 0;
        int len = nums.length;
        for (int i = 0; i < len; i++)
            sum = sum + nums[i];
        return (len * (len + 1) / 2 - sum);
    }

}
