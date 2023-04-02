package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P905_SortArrayByParity {

    public int[] sortArrayByParity1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[nums.length];
        int index = 0;
        while (index < nums.length) {
            int num = nums[index];
            if (num % 2 == 0)
                arr[left++] = nums[index++];
            else
                arr[right--] = nums[index++];
        }
        return arr;
    }

    public int[] sortArrayByParity2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while (left < right) {
            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right--] = temp;
            } else if (nums[left] % 2 == 0)
                ++left;
            else if (nums[right] % 2 == 1)
                --right;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P905_SortArrayByParity()
                .sortArrayByParity1(new int[]{1, 3, 5, 4, 98, 5641, 1, 1, 21, 54})));

        System.out.println(Arrays.toString(new P905_SortArrayByParity()
                .sortArrayByParity2(new int[]{1, 3, 5, 4, 98, 5641, 1, 1, 21, 54})));
    }

}
