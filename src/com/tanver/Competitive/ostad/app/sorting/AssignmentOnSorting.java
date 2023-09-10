package com.tanver.Competitive.ostad.app.sorting;

import java.util.Arrays;

public class AssignmentOnSorting {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 0};
        int[] nums2 = new int[]{1};
        new AssignmentOnSorting().merge(nums1, 1, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }

}
