package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P373_FindKPairswithSmallestSums {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int counter = 0;
        while (i < nums1.length && j < nums2.length) {
            result.add(List.of(nums1[i], nums2[j]));
            if (++counter == k)
                break;
            if (i + 1 == nums1.length) {
                i = 0;
                ++j;
            } else if (j + 1 == nums2.length) {
                j = 0;
                ++i;
            }
            else if (nums1[i + 1] < nums2[j + 1])
                ++i;
            else
                ++j;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P373_FindKPairswithSmallestSums().kSmallestPairs(
                new int[]{1, 7, 11},
                new int[]{2, 4, 6},
                9
        ));
    }

}
