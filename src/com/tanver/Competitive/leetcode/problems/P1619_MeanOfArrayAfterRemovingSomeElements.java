package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P1619_MeanOfArrayAfterRemovingSomeElements {

    public double trimMean(int[] arr) {
        int len = arr.length;
        int len5Percent = (int) (len * .05);
        Arrays.sort(arr);
        int sum = 0;
        for (int i = len5Percent; i < len - len5Percent; i++)
            sum += arr[i];
        return (double) sum / (len - 2 * len5Percent);
    }

    public static void main(String[] args) {

        System.out.println(new P1619_MeanOfArrayAfterRemovingSomeElements()
                .trimMean(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3}));

        System.out.println(new P1619_MeanOfArrayAfterRemovingSomeElements()
                .trimMean(new int[]{6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0}));

        System.out.println(new P1619_MeanOfArrayAfterRemovingSomeElements()
                .trimMean(new int[]{6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4}));
    }

}
