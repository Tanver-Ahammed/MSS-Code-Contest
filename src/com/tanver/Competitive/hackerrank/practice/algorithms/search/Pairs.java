package com.tanver.Competitive.hackerrank.practice.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) throws Exception {

        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        int k = inr.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = inr.nextInt();
        }
        Arrays.sort(num);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[j] - num[i] == k || num[i] - num[j] == k) {
                    count++;
                } else if (num[j] - num[i] > k || num[i] - num[j] > k) {
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
