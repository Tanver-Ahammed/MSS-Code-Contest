package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P645_SetMismatch {

    public int[] findErrorNums1(int[] nums) {
        Arrays.sort(nums);
        int dup = 0;
        int miss = 0;
        int prev = 0;
        for (int num : nums) {
            if (num == prev)
                dup = num;
            else if (prev + 2 == num)
                miss = num - 1;
            prev = num;
        }
        if (miss == 0)
            miss = nums.length;
        return new int[]{dup, miss};
    }

    public int[] findErrorNums2(int[] nums) {
        int dup = 0;
        int miss = 0;
        int[] arr = new int[nums.length + 1];
        for (int num : nums)
            arr[num]++;
        for (int i = 1; i < nums.length; i++) {
            if (arr[i] == 0)
                miss = i;
            else if (arr[i] == 2)
                dup = i;
        }
        return new int[]{dup, miss};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P645_SetMismatch()
                .findErrorNums2(new int[]{1, 2, 2})));
    }

}
