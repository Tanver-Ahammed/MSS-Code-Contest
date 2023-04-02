package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P1991_FindTheMiddleIndexInArray {

    public int findMiddleIndex1(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        System.out.println(Arrays.toString(prefixSum));
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum = prefixSum[i] - nums[i];
            rightSum = prefixSum[prefixSum.length - 1] - prefixSum[i];
            if (leftSum - rightSum == 0)
                return i;
        }
        return -1;
    }

    public int findMiddleIndex2(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum == totalSum)
                return i;
            totalSum -= nums[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new P1991_FindTheMiddleIndexInArray().
                findMiddleIndex2(new int[]{2, 3, -1, 8, 4}));

        System.out.println(new P1991_FindTheMiddleIndexInArray()
                .findMiddleIndex2(new int[]{1, -1, 4}));
    }

}
