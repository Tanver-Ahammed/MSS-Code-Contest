package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P2215_FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        for (int num : set1) {
            if (!set2.contains(num))
                result1.add(num);
        }
        for (int num : set2) {
            if (!set1.contains(num))
                result2.add(num);
        }

        result.add(result1);
        result.add(result2);
        return result;
    }

    public static void main(String[] args) {

    }

}
