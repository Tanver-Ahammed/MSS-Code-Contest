package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P34_FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int startingPosition = leftBinarySearch(nums, target);
        int endingPosition = leftBinarySearch(nums, target + 1) - 1;
        if (startingPosition < nums.length && nums[startingPosition] == target) {
            return new int[]{startingPosition, endingPosition};
        }
        return new int[]{-1, -1};
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
        System.out.println(Arrays.toString(new P34_FindFirstAndLastPositionOfElementInSortedArray()
                .searchRange(new int[]{1, 5, 6, 15, 15, 15, 15, 15, 16}, 15)));
    }

}


/*
 public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[]{-1, -1};
        return new int[]{binarySearch(nums, target, true),
                binarySearch(nums, target, false)};
    }

    private int binarySearch(int[] nums, int target, boolean isLeft) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left);
            if (isLeft && nums[mid] < target)
                left = mid + 1;
            if (!isLeft && nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        if (isLeft) {
            if (left == -1 || left > nums.length - 1 || nums[left] != target)
                return -1;
            return left;
        } else {
            if (right == -1 || right > nums.length - 1 || nums[right] != target)
                return -1;
            return right;
        }
    }
* */