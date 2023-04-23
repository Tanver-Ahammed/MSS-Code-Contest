package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P496_NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            int equalIndex = 0;
            int iteratedIndex = 0;
            while (iteratedIndex < nums2.length) {
                if (temp == nums2[equalIndex]) {
                    if (nums1[i] < nums2[iteratedIndex])
                        nums1[i] = nums2[iteratedIndex];
                } else
                    ++equalIndex;
                ++iteratedIndex;
            }
            if (nums1[i] == temp)
                nums1[i] = -1;
        }
        return nums1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P496_NextGreaterElementI().nextGreaterElement(
                new int[]{1, 3, 5, 2, 4},
                new int[]{6, 5, 4, 3, 2, 1, 7}
        )));
    }

}
