package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P912_SortAnArray {

    public int[] sortArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] firstHalf = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] secondHalf = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(firstHalf, secondHalf);
    }

    public int[] merge(int[] firstHalf, int[] secondHalf) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[firstHalf.length + secondHalf.length];
        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] < secondHalf[j])
                result[k++] = firstHalf[i++];
            else
                result[k++] = secondHalf[j++];
        }
        while (i < firstHalf.length)
            result[k++] = firstHalf[i++];
        while (j < secondHalf.length)
            result[k++] = secondHalf[j++];
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P912_SortAnArray()
                .sortArray(new int[]{6545, 656, 54, 646, 456, 46, 46, 463, 12, 631, 6241, 41, 5641})));
    }

}
