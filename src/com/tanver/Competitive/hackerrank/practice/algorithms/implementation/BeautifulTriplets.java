package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int countTriples = 0;
        int temp = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                temp = arr[j] - arr[i];
                if (temp == d) {
                    for (int k = j + 1; k < arr.length; k++) {
                        temp = arr[k] - arr[j];
                        if (temp == d)
                            ++countTriples;
                    }
                }
            }
        }

        System.out.println(countTriples);

    }
}
