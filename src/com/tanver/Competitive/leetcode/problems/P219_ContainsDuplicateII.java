package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P219_ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k)
                return true;
            else
                map.put(nums[i], i);
        }
        return false;
    }

}
