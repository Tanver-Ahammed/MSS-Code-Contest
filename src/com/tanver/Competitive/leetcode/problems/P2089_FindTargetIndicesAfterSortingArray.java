package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2089_FindTargetIndicesAfterSortingArray {


    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int startingPosition = leftBinarySearch(nums, target);
        int endingPosition = leftBinarySearch(nums, target + 1) - 1;
        List<Integer> list = new ArrayList<>();
        if (startingPosition < nums.length && nums[startingPosition] == target) {
            for (int i = startingPosition; i <= endingPosition; i++) {
                list.add(i);
            }
        }
        return list;
    }

    private int leftBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new P2089_FindTargetIndicesAfterSortingArray()
                .targetIndices(new int[]{1, 2, 5, 5, 5, 2, 5, 3}, 5));

    }

}
