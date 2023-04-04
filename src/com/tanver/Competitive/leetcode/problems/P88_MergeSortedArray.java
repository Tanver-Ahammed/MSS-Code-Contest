package com.tanver.Competitive.leetcode.problems;

public class P88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newArr = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j])
                newArr[k++] = nums1[i++];
            else
                newArr[k++] = nums2[j++];
        }
        while (i < m)
            newArr[k++] = nums1[i++];
        while (j < n)
            newArr[k++] = nums2[j++];

        for (int l = 0; l < newArr.length; l++) {
            nums1[l] = newArr[l];
        }
    }

    public static void main(String[] args) {

    }

}
