package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P2206_DivideArrayIntoEqualPairs {

    public boolean divideArray1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int value : map.values())
            if (value % 2 != 0)
                return false;
        return true;
    }

    public boolean divideArray2(int[] nums) {
        int[] n = new int[501];
        for (int num : nums)
            n[num]++;
        for (int i = 0; i < 501; i++) {
            if (n[i] % 2 == 1) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
