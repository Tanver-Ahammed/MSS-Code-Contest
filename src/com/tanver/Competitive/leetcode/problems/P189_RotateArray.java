package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P189_RotateArray {

    public void rotate1(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] tempArr = new int[k];
        for (int i = len - k; i < len; i++)
            tempArr[i + k - len] = nums[i];
        for (int i = len - k - 1; i >= 0; i--)
            nums[i + k] = nums[i];
        for (int i = 0; i < tempArr.length; i++)
            nums[i] = tempArr[i];
    }

    public void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
//        new P189_RotateArray().rotate1(arr, 2);
        new P189_RotateArray().rotate2(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

}
