package com.tanver.Competitive.leetcode.problems;

public class P74_Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        for (int[] array : matrix) {
            if (binarySearch(array, target))
                return true;
        }
        return false;
    }

    private boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = right - (right - left) / 2;
            if (array[mid] == target)
                return true;
            else if (array[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
