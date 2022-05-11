package com.tanver.Competitive.gfg.practice;

import java.util.Scanner;

public class WaveArray {
    public int[] wave(int arr[], int n) {
        if (n % 2 == 1) {
            n = n - 1;
        }

        for (int i = 0; i < n; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new WaveArray().wave(arr, n);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println(arr[n - 1]);
    }
}
