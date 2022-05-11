package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;// package src.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.*;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        int keyboard = scanner.nextInt();
        int drive = scanner.nextInt();
        int[] keyboards = new int[keyboard];
        int[] drives = new int[drive];
        for (int i = 0; i < keyboard; i++) {
            keyboards[i] = scanner.nextInt();
        }
        for (int i = 0; i < drive; i++) {
            drives[i] = scanner.nextInt();
        }
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        aa:
        for (int i = keyboard - 1; i >= 0; i--) {
            for (int j = drive - 1; j >= 0; j--) {
                sum = keyboards[i] + drives[j];
                if (sum <= budget) {
                    list.add(sum);
                }
            }
        }
        Collections.sort(list);
        if (!list.isEmpty())
            System.out.println(list.get((list.size()) - 1));
        else
            System.out.println(-1);
    }
}
