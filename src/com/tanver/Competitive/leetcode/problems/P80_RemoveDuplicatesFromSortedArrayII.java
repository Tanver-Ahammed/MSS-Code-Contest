package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P80_RemoveDuplicatesFromSortedArrayII {

    // 1, 1, 1, 2, 2, 3
    public int removeDuplicates1(int[] nums) {
        int len = nums.length;
        int index = 1;
        int count = 1;
        int counter = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] == nums[i]) {
                if (count < 3) {
                    nums[index++] = nums[i];
                    ++count;
                    ++counter;
                }
                ++count;
            } else {
                nums[index++] = nums[i];
                count = 1;
                ++counter;
            }
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }

    // 1, 1, 1, 2, 2, 3
    public int removeDuplicates2(int[] nums) {
        int prev = nums[0], counter = 1, count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i])
                count++;
            else if (prev != nums[i])
                count = 0;
            if (count <= 1)
                nums[counter++] = nums[i];
            prev = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return counter;
    }


    // 1, 1, 1, 2, 2, 3
    public int removeDuplicates3(int[] nums) {
        int index = 1;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                count++;
            else
                count = 0;
            if (count <= 1)
                nums[index++] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new P80_RemoveDuplicatesFromSortedArrayII().removeDuplicates1(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(new P80_RemoveDuplicatesFromSortedArrayII().removeDuplicates2(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(new P80_RemoveDuplicatesFromSortedArrayII().removeDuplicates3(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

}
