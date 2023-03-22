package com.tanver.Competitive.leetcode.problems;

public class P35_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = high - (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(new P35_SearchInsertPosition()
                .searchInsert(new int[]{1, 2, 3, 5, 7, 9, 11}, 6));
    }

}
