package com.tanver.Competitive.leetcode.problems;

public class P896_MonotonicArray {

    public boolean isMonotonic1(int[] nums) {
        int inc = 0;
        int dec = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                inc++;
            else if (nums[i] < nums[i + 1])
                dec++;
        }
        return inc == 0 || dec == 0;
    }

    public boolean isMonotonic2(int[] arr) {
        if (arr[arr.length - 1] < arr[0])
            reverse(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    private void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}
