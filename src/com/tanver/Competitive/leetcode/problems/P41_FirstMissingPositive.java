package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P41_FirstMissingPositive {

    public int firstMissingPositive1(int[] nums) {
        Arrays.sort(nums);
        int start = 1;
        int prev = 0;
        for (int num : nums) {
            if (prev == num)
                continue;
            if (num > 0) {
                if (num == start) {
                    start++;
                    prev = num;
                } else
                    return start;
            }
        }
        return start;
    }

    public int firstMissingPositive2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0)
                set.add(num);
        }
        int number;
        for (number = 1; ; number++) {
            if (!set.contains(number))
                return number;
        }
    }

    public int firstMissingPositive3(int[] nums) {
        int[] ans = new int[nums.length + 1];
        for (int num : nums) {
            if (num > 0 && num <= nums.length)
                ans[num] = 1;
        }
        for (int i = 1; i < ans.length; i++) {
            if (ans[i] == 0) {
                return i;
            }
        }
        return ans.length;
    }

    public static void main(String[] args) {
        System.out.println(new P41_FirstMissingPositive().firstMissingPositive1(new int[]
                {1, 2, 2, 0}));

        System.out.println(new P41_FirstMissingPositive().firstMissingPositive1(new int[]
                {7, 8, 9, 11, 12}));
    }

}
