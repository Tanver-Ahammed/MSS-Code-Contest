package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1)
            set1.add(num);
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2)
            set2.add(num);

        Set<Integer> maiSet = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var))
                maiSet.add(var);
        }
        int[] arr = new int[maiSet.size()];
        int index = 0;
        for (Integer val : maiSet) {
            arr[index] = val;
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {

    }

}
