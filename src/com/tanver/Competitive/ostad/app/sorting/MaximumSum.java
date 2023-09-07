package com.tanver.Competitive.ostad.app.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        long sum = 0L;
        for (int i = 0; i < k; i++) {
            sum += arr[n - 1 - i];
        }
        System.out.println(sum);

    }
}
