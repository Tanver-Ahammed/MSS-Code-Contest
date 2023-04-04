package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2161_PartitionArrayAccordingToGivenPivot {

    public int[] pivotArray(int[] nums, int pivot) {
        int[] pivotArr = new int[nums.length];
        int[] greaterPivotArr = new int[nums.length];
        int index = 0;
        int pivotIndex = 0;
        int greaterPivotIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot)
                nums[index++] = nums[i];
            else if (nums[i] > pivot)
                greaterPivotArr[greaterPivotIndex++] = nums[i];
            else
                pivotArr[pivotIndex++] = nums[i];
        }
        for (int i = 0; i < pivotIndex; i++)
            nums[index++] = pivotArr[i];
        for (int i = 0; i < greaterPivotIndex; i++)
            nums[index++] = greaterPivotArr[i];
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2161_PartitionArrayAccordingToGivenPivot()
                .pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)));
    }

}
