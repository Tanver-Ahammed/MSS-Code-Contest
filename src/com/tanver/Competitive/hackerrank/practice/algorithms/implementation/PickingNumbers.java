package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PickingNumbers {
    public static void picklingNum(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> max = new ArrayList<>();
        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = Math.abs(arr[index] - arr[i + 1]);
            if (temp <= 1) {
                ++sum;
            } else {
                index = i;
                ++index;
                max.add(++sum);
                sum = 0;
            }
        }
        max.add(++sum);
        Collections.sort(max);
        System.out.println(max.get((max.size()) - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        picklingNum(arr);
    }
}