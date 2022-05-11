package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] sl = new int[n];
        for (int i = 0; i < sl.length; i++) {
            sl[i] = scanner.nextInt();
        }
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = a; i <= b; i++) {
                list.add(sl[i]);
            }
            Collections.sort(list);
            System.out.println(list.get(0));
        }
    }
}
