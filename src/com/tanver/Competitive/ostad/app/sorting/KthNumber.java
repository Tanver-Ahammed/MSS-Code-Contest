package com.tanver.Competitive.ostad.app.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class KthNumber {
    public static void main(String[] args) {
        /**
         * Write your Java code from here
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
