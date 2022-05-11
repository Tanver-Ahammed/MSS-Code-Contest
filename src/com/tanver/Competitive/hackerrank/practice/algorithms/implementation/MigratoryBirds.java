package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int count = -1;
        int maxCount = 0;
        int result = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    result = arr[i - 1];
                    count = 0;
                }
            }
        }
        System.out.println(result   );
        System.out.println();
    }
}
