package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P1365_HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedArr = new int[nums.length];
        System.arraycopy(nums, 0, sortedArr, 0, nums.length);
        Arrays.sort(sortedArr);
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[i] > sortedArr[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            nums[i] = left;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P1365_HowManyNumbersAreSmallerThanTheCurrentNumber()
                .smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }

}
