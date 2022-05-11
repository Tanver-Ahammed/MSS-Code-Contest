package com.tanver.Competitive.hackerrank.practice.datastructures.arrays;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        d = d % n;
        int[] temArr = new int[n];
        int index = 0;
        for (int i = d; i < n; i++) {
            temArr[i - d] = arr[i];
            ++index;
        }
        for (int i = 0; i < d; i++) {
            temArr[index] = arr[i];
            ++index;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temArr[i] + " ");
        }
    }
}
