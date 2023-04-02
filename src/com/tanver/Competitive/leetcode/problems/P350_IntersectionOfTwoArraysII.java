package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P350_IntersectionOfTwoArraysII {

    public int[] intersect1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums1) map1.put(num, map1.getOrDefault(num, 0) + 1);
        for (int num : nums2) map2.put(num, map2.getOrDefault(num, 0) + 1);
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : map1.keySet()) {
            int key = integer;
            if (map2.containsKey(key)) {
                int temp1 = map1.get(key);
                int temp2 = map2.get(key);
                int temp = Math.min(temp1, temp2);
                for (int i = 0; i < temp; i++)
                    newList.add(key);
            }
        }
        int[] results = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++)
            results[i] = newList.get(i);
        return results;
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(new P350_IntersectionOfTwoArraysII().
                intersect2(new int[]{1, 2, 2, 1}, new int[]{2})));
    }

}
