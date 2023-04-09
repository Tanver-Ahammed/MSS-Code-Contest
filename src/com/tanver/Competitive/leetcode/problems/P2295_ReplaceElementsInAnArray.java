package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2295_ReplaceElementsInAnArray {

    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);

        for (int[] operation : operations) {
            int index = map.get(operation[0]);
            nums[index] = operation[1];
            map.remove(operation[0]);
            map.put(operation[1], index);
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2295_ReplaceElementsInAnArray().arrayChange(
                new int[]{1, 2, 4, 6}, new int[][]{{1, 3}, {4, 7}, {6, 1}}
        )));
    }

}
