package com.tanver.Competitive.leetcode.problems;

public class P152_MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        int prod = 1;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            prod = prod * num;
            max = Math.max(prod, max);
            if (prod == 0)
                prod = 1;
        }
        prod = 1;
        for (int i = len - 1; i >= 0; i--) {
            prod = prod * nums[i];
            max = Math.max(prod, max);
            if (prod == 0)
                prod = 1;
        }
        return max;
    }

    public static void main(String[] args) {

    }

}
