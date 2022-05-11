package com.tanver.study.numbertheory.matrixexponentiation;

import java.util.Scanner;

public class MatrixExponentiation {
    private static long[][] matrixMultiply(long[][] matrix1, long[][] matrix2) {
        long mod = 1000000007;
        int len = matrix1.length;
        long[][] result = new long[len][len];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    long x = (matrix1[i][k] * matrix2[k][j]) % mod;
                    result[i][j] = (result[i][j] + x) % mod;
                }
            }
        }
        return result;
    }

    private static long[][] matrixExponentiation(long[][] matrix, long power) {
        int len = matrix.length;
        long[][] identityResult = new long[len][len];
        for (int i = 0; i < matrix.length; i++) {
            identityResult[i][i] = 1;
        }

        while (power != 0) {
            if (power % 2 == 0) {
                matrix = matrixMultiply(matrix, matrix);
                power = power / 2;
            } else {
                identityResult = matrixMultiply(identityResult, matrix);
                power = power - 1;
            }
        }
        return identityResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[][] arr = new long[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int power = scanner.nextInt();
        arr = matrixExponentiation(arr, power);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
