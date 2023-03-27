package com.tanver.Competitive.leetcode.problems;

public class P48_RotateImage {

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] newMatrix = new int[len][len];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                newMatrix[j][len - i - 1] = matrix[i][j];
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++)
                matrix[i][j] = newMatrix[i][j];
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new P48_RotateImage().rotate(arr);
    }

}
