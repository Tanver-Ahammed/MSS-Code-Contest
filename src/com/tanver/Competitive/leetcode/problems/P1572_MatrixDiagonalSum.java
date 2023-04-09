package com.tanver.Competitive.leetcode.problems;

public class P1572_MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int diagonalSum = 0;
        for (int i = 0; i < len; i++) {
            diagonalSum += mat[i][i] + mat[i][len - i - 1];
        }
        if (len % 2 == 1)
            diagonalSum -= mat[len / 2][len / 2];
        return diagonalSum;
    }

    public static void main(String[] args) {
        System.out.println(new P1572_MatrixDiagonalSum().diagonalSum(new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        }));
    }

}
