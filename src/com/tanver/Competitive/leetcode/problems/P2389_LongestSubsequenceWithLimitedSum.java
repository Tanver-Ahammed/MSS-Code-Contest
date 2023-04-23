package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2389_LongestSubsequenceWithLimitedSum {

    public int[] answerQueries1(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        for (int i = 0; i < queries.length; i++) {
            boolean isVisited = false;
            for (int j = 0; j < prefixSum.length; j++) {
                if (queries[i] < prefixSum[j]) {
                    queries[i] = j;
                    isVisited = true;
                    break;
                }
            }
            if (!isVisited)
                queries[i] = nums.length;
        }
        return queries;
    }

    public int[] answerQueries2(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        for (int i = 0; i < queries.length; i++) {
            int index = Arrays.binarySearch(prefixSum, queries[i]);
            queries[i] = Math.abs(index + 1);
        }
        return queries;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2389_LongestSubsequenceWithLimitedSum().answerQueries2(
                new int[]{4, 5, 2, 1},
                new int[]{3, 10, 12}
        )));
    }

}
