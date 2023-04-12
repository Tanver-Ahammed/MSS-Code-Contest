package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P215_KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        System.out.println(new P215_KthLargestElementInAnArray()
                .findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

}
