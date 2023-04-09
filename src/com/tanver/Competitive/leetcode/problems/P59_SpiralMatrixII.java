package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P59_SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int top = 0;
        int right = n - 1;
        int down = n - 1;
        int dir = 0;
        int counter = 0;
        while (left <= right && top <= down) {
            if (dir == 0) {
                for (int i = left; i <= right; i++)
                    matrix[top][i] = ++counter;
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= down; i++)
                    matrix[i][right] = ++counter;
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--)
                    matrix[down][i] = ++counter;
                down--;
            } else if (dir == 3) {
                for (int i = down; i >= top; i--)
                    matrix[i][left] = ++counter;
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new P59_SpiralMatrixII().generateMatrix(5)));
    }

}
