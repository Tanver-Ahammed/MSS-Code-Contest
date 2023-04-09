package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P287_FindTheDuplicateNumber {

    public int findDuplicate1(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for (int num : nums) {
            if (freq[num] == 0) {
                freq[num] += 1;
            } else {
                return num;
            }
        }
        return 0;
    }

    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return num;
            else
                set.add(num);
        }
        return 0;
    }

    public static void main(String[] args) {

    }

}
