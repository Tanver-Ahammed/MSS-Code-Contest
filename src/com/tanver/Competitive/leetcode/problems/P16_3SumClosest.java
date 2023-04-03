package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P16_3SumClosest {

    public int threeSumClosest1(int[] nums, int target) {
        int len = nums.length;
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum - target) < diff) {
                        diff = Math.abs(sum - target);
                        result = sum;
                        if (diff == target)
                            return sum;
                    }
                }
            }
        }
        return result;
    }

    public int threeSumClosest2(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target)
                    right--;
                else if (sum < target)
                    left++;
                else
                    return sum;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P16_3SumClosest()
                .threeSumClosest2(new int[]{0, 0, 0}, 1));
    }

}
