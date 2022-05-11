package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[] {map.get(target - x), i};
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No Solution");
    }

    public static void main(String[] args) {
        P1_TwoSum obj = new P1_TwoSum();

        System.out.println(Arrays.toString(obj.twoSum(new int[]{1, 2, 3, 4, 5}, 9)));

    }
}