package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P867_TransposeMatrix {

    public int[][] transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new P867_TransposeMatrix().transpose(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        })));
    }

}
