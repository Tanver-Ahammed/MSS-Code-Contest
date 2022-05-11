package com.tanver.Competitive.hackerrank.practice.algorithms.bitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximizingXOR {
    private static int calculateXOR(int a, int b) {
        return a ^ b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> xorNumbers = new ArrayList<>();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                xorNumbers.add(calculateXOR(i, j));
            }
        }
        Collections.sort(xorNumbers);
        System.out.println(xorNumbers.get(xorNumbers.size() - 1));
    }
}