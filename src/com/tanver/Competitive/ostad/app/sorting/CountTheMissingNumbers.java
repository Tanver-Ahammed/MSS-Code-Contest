package com.tanver.Competitive.ostad.app.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheMissingNumbers {
    public static void main(String[] args) {
        /**
         * Write your Java code from here
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int i = 0;
        for (i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        int counter = 1;
        for (i = 1; i < n; i++) {
            if (arr[i] >= k)
                break;
            if (arr[i - 1] != arr[i])
                ++counter;
        }
        if (k - counter - 1 < 0)
            System.out.println(0);
        else
            System.out.println(k - counter - 1);
    }
}
