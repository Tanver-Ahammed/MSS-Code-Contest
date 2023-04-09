package com.tanver.Competitive.leetcode.problems;

public class P2319_CheckIfMatrixIsXMatrix {

    public boolean checkXMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (i == j || len - i - 1 == j) {
                    if (grid[i][j] == 0)
                        return false;
                } else {
                    if (grid[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P2319_CheckIfMatrixIsXMatrix().checkXMatrix(new int[][]{
                        {2, 0, 0, 1},
                        {0, 3, 1, 0},
                        {0, 5, 2, 0},
                        {4, 0, 0, 2}
                }
        ));
    }

}
