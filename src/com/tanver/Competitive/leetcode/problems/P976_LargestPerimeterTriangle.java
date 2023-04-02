package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P976_LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = nums.length - 1; i > 1; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i])
                return nums[i - 2] + nums[i - 1] + nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new P976_LargestPerimeterTriangle()
                .largestPerimeter(new int[]{2, 1, 2}));
    }

}
