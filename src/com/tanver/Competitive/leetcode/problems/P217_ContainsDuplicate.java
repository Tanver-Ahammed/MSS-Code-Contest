package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.get(5);
        map.containsKey(5);

    }

}
