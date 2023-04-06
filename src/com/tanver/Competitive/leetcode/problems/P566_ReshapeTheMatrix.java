package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P566_ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length <= r && mat[0].length <= c || mat.length * mat[0].length > r * c)
            return mat;
        int[][] reshapeMatrix = new int[r][c];
        int rr = 0, rc = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                reshapeMatrix[rr][rc] = mat[i][j];
                if (rc < c - 1)
                    ++rc;
                else {
                    rc = 0;
                    rr++;
                }
            }
        }
        return reshapeMatrix;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2},
                {3, 4}
        };

        System.out.println(Arrays.deepToString(new P566_ReshapeTheMatrix()
                .matrixReshape(arr, 4, 1)));

        System.out.println(arr.length);
        System.out.println(arr[0].length);

    }

}
