package com.tanver.Competitive.leetcode.problems;

public class P2133_CheckIfEveryRowAndColumnContainsAllNumbers {

    public boolean checkValid(int[][] matrix) {
        for (int[] value : matrix) {
            boolean[] used = new boolean[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                int val = value[j];
                int idx = val - 1;
                if (used[idx]) {
                    return false;
                }
                used[idx] = true;
            }
        }

        // Check each column
        for (int j = 0; j < matrix.length; j++) {
            boolean[] used = new boolean[matrix.length];
            for (int[] ints : matrix) {
                int val = ints[j];
                int idx = val - 1;
                if (used[idx]) {
                    return false;
                }
                used[idx] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P2133_CheckIfEveryRowAndColumnContainsAllNumbers()
                .checkValid(new int[][]{
                        {1, 2, 3},
                        {3, 1, 2},
                        {2, 3, 1},
                }));
    }

}
