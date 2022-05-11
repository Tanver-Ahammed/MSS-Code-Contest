package com.tanver.Competitive.hackerrank.practice.datastructures.arrays;

import java.util.Scanner;

public class Array_2D {
    private static final int MAX_INDEX = 6;
    private static final int OFFSET_VALUE = 2;
    private static int matrix[][] = new int[MAX_INDEX][MAX_INDEX];
    private static int maxHourglass = -63;

    private static void hourglass(int i, int j) {
        int tmp = 0;
        for (int k = j; k <= j + OFFSET_VALUE; k++) {
            tmp += matrix[i][k];
            tmp += matrix[i + OFFSET_VALUE][k];
        }

        tmp += matrix[i + 1][j + 1];

        if (maxHourglass < tmp) {
            maxHourglass = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAX_INDEX; i++) {
            for (int j = 0; j < MAX_INDEX; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();

        for (int i = 0; i < MAX_INDEX - OFFSET_VALUE; i++) {
            for (int j = 0; j < MAX_INDEX - OFFSET_VALUE; j++) {
                hourglass(i, j);
            }
        }

        System.out.println(maxHourglass);
    }
}