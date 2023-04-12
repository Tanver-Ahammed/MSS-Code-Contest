package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P2190_MostFrequentNumberFollowingKeyInAnArray {

    public int mostFrequent1(int[] nums, int key) {
        int[] freq = new int[1001];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == key)
                freq[nums[i]]++;
        }

        int max = 0;
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] > freq[max])
                max = i;
        }
        return max;
    }

    public int mostFrequent2(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key)
                map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.reverseOrder());
        int max = list.get(0);
        for (int k : map.keySet()) {
            if (map.get(k) == max)
                return k;
        }
        return 0;
    }

    public static void main(String[] args) {

    }

}
