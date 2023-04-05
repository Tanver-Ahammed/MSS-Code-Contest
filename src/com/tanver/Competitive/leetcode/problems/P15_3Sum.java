package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P15_3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0)
                    right--;
                else if (sum < 0)
                    left++;
                else {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

    }

}
