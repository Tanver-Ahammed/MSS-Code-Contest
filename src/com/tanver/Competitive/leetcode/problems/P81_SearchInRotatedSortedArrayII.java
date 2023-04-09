package com.tanver.Competitive.leetcode.problems;

public class P81_SearchInRotatedSortedArrayII {

    public boolean search1(int[] nums, int target) {
        for (int num : nums) {
            if (num == target)
                return true;
        }
        return false;
    }

    public boolean search2(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[low] < nums[mid]) {
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (nums[low] > nums[mid]) {
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else
                low++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new P81_SearchInRotatedSortedArrayII().search1(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        System.out.println(new P81_SearchInRotatedSortedArrayII().search2(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
    }

}
