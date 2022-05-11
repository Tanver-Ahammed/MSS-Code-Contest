package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int minPage = Math.min(p, n - p);
        if ((n - p < p) && (n % 2 == 0 && (p % 2 == 1))) {
            minPage++;
        }
        System.out.println(minPage / 2);
    }
}
