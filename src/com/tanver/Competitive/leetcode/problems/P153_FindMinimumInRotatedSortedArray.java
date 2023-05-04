package com.tanver.Competitive.leetcode.problems;

public class P153_FindMinimumInRotatedSortedArray {

    public int findMin1(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
        }
        return min;
    }

    public int findMin2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        return nums[right];
    }

    public static void main(String[] args) {

    }

}
