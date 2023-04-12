package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P229_MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> list = new ArrayList<>();
        int temp = nums.length / 3;
        for (Integer key : map.keySet()) {
            if (map.get(key) > temp)
                list.add(key);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new P229_MajorityElementII().
                majorityElement(new int[]{3, 2}));
    }

}
