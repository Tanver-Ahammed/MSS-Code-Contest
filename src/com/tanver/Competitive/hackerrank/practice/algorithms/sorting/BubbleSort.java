package com.tanver.Competitive.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void countSwaps(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    ++count;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.\n" +
                "First Element: " + arr[0] + "\n" +
                "Last Element: " + arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        countSwaps(arr);
    }
}
