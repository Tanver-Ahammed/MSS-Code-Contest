package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P347_TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> frequencies = new ArrayList<>(map.values());
        frequencies.sort(Comparator.reverseOrder());
        int[] result = new int[k];

        int index = 0;
        for (int frequency : frequencies) {
            for (int key : map.keySet()) {
                if (index == k)
                    return result;
                if (frequency == map.get(key)) {
                    result[index++] = key;
                    map.remove(key);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P347_TopKFrequentElements().topKFrequent(
                new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6},
                10
        )));
    }

}
