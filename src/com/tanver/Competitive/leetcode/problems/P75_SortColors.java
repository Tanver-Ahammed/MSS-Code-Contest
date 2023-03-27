package com.tanver.Competitive.leetcode.problems;

public class P75_SortColors {

    public void sortColors(int[] nums) {
        int c0 = 0;
        int c1 = 0;
        for (int num : nums) {
            if (num == 0) ++c0;
            else if (num == 1) ++c1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (c0 > 0) {nums[i] = 0; --c0;}
            else if (c1 > 0) {nums[i] = 1; --c1;}
            else {nums[i] = 2;
            }
        }
    }

    public static void main(String[] args) {

    }

}
