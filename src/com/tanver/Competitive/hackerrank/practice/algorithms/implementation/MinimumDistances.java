package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.*;

public class MinimumDistances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    list.add(Math.abs(j - i));
                }
            }
        }
        Collections.sort(list);
        if (list.size() == 0)
            System.out.println(-1);
        else
            System.out.println(list.get(0));
    }
}
