package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2341_MaximumNumberOfPairsInArray {

    public int[] numberOfPairs1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        int[] result = new int[2];
        for (int value : map.values()) {
            result[0] += value / 2;
            result[1] += value % 2;
        }
        return result;
    }

    public int[] numberOfPairs2(int[] nums) {
        int[] count = new int[101];
        for (int num : nums)
            count[num]++;
        int total = 0;
        int remain = 0;
        for (int value : count) {
            total += value / 2;
            remain += value % 2;
        }
        return new int[]{total, remain};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2341_MaximumNumberOfPairsInArray()
                .numberOfPairs2(new int[]{1, 3, 2, 1, 3, 2, 2})));
    }

}
