package com.tanver.Competitive.ostad.app.searching;

public class AssignmentOnSearching {

    public static int findMinRotArr(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }

        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(findMinRotArr(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMinRotArr(new int[]{0, 1, 2, 4, 5, 6, 7}));
        System.out.println(findMinRotArr(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMinRotArr(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMinRotArr(new int[]{11, 13, 15, 17}));
    }

}
