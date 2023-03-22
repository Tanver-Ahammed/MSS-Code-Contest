package com.tanver.Competitive.leetcode.problems;

public class P27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                ++index;
                ++counter;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }

}



