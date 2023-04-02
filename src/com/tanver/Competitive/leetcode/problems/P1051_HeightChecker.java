package com.tanver.Competitive.leetcode.problems;

import com.tanver.Main;

import java.util.Arrays;

public class P1051_HeightChecker {

    public int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOfRange(heights, 0, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i])
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new P1051_HeightChecker().heightChecker(new int[]{1, 1, 4, 2, 1, 3}));
        System.out.println(new P1051_HeightChecker().heightChecker(new int[]{5, 1, 2, 3, 4}));
    }

}
