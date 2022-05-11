package com.tanver.Competitive.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

public class IntroToTutorialChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == v)
                temp = i;
        }
        System.out.println(temp);
    }
}
