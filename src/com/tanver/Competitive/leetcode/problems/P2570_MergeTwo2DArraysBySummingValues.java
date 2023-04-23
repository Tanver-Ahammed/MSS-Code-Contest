package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class P2570_MergeTwo2DArraysBySummingValues {

    public int[][] mergeArrays1(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] num : nums1) map.put(num[0], num[1]);
        for (int[] num : nums2) map.put(num[0], map.getOrDefault(num[0], 0) + num[1]);
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (int key : map.keySet()) result[index++] = new int[]{key, map.get(key)};
        Arrays.sort(result, Comparator.comparingInt(a -> a[0]));
        return result;
    }

    public int[][] mergeArrays2(int[][] nums1, int[][] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ptr1 = 0, ptr2 = 0;
        int[][] ans = new int[len1 + len2][2];
        int i = 0;
        while (ptr1 < len1 && ptr2 < len2) {
            if (nums1[ptr1][0] > nums2[ptr2][0]) {
                ans[i] = nums2[ptr2];
                i++;
                ptr2++;
            } else if (nums1[ptr1][0] < nums2[ptr2][0]) {
                ans[i] = nums1[ptr1];
                i++;
                ptr1++;
            } else {
                ans[i][0] = nums1[ptr1][0];
                ans[i][1] = nums1[ptr1][1] + nums2[ptr2][1];
                i++;
                ptr1++;
                ptr2++;
            }
        }
        while (ptr1 < len1) {
            ans[i] = nums1[ptr1];
            i++;
            ptr1++;

        }
        while (ptr2 < len2) {
            ans[i] = nums2[ptr2];
            i++;
            ptr2++;
        }
        int pos = 0;
        for (int[] an : ans) {
            if (an[0] == 0) break;
            pos++;
        }
        int[][] result = new int[pos][2];
        System.arraycopy(ans, 0, result, 0, pos);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new P2570_MergeTwo2DArraysBySummingValues()
                .mergeArrays2(
                        new int[][]{{1, 2}, {2, 3}, {4, 5}},
                        new int[][]{{1, 4}, {3, 2}, {4, 1}}
                )));
    }

}
