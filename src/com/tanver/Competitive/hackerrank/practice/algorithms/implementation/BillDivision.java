package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] bill = new int[n];
        for (int i = 0; i < n; i++) {
            bill[i] = scanner.nextInt();
        }
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != k)
                sum += bill[i];
        }
        sum = b - sum / 2;
        if (sum > 0)
            System.out.println(sum);
        else
            System.out.println("Bon Appetit");

    }
}
