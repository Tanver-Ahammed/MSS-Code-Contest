package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2643_RowWithMaximumOnes {

    public int[] rowAndMaximumOnes(int[][] mat) {
        int index = 0;
        int maxOne = 0;
        for (int i = 0; i < mat.length; i++) {
            int[] arr = mat[i];
            int counter = 0;
            for (int num : arr) {
                if (num == 1)
                    ++counter;
            }
            if (counter > maxOne) {
                maxOne = counter;
                index = i;
            }
        }
        return new int[]{index, maxOne};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2643_RowWithMaximumOnes().
                rowAndMaximumOnes(new int[][]{{0, 0, 0}, {0, 1, 1}})));
    }

}
