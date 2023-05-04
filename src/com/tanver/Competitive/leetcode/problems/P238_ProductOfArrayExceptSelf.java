package com.tanver.Competitive.leetcode.problems;

public class P238_ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCounter = 0;
        for (int num : nums)
            if (num != 0)
                prod *= num;
            else
                zeroCounter++;
        for (int i = 0; i < nums.length; i++) {
            if (zeroCounter > 1)
                nums[i] = 0;
            else if (zeroCounter == 0)
                nums[i] = prod / nums[i];
            else {
                if (nums[i] == 0)
                    nums[i] = prod;
                else
                    nums[i] = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

    }

}
