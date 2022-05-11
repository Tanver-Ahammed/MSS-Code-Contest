package com.tanver.Competitive.codechef.januaryChallenge21div3;

import java.util.Arrays;
import java.util.Scanner;

public class Fair_Elections {
    private static void electionOperation(int[] a, int[] b, int sumA, int sumB) {
        boolean flag = false;

        int numOperation, numOfOperation = 0;
        numOperation = Math.min(a.length, b.length);

        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < numOperation; i++) {
            sumA = sumA - a[i] + b[b.length - 1 - i];
            sumB = sumB - b[b.length - 1 - i] + a[i];
            numOfOperation++;
            if (sumA > sumB) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println(numOfOperation);
        else
            System.out.println(-1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n, m, sumA = 0, sumB = 0;
            n = scanner.nextInt();
            m = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
                sumA += a[i];
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = scanner.nextInt();
                sumB += b[i];
            }
            if (sumA > sumB)
                System.out.println(0);
            else
                electionOperation(a, b, sumA, sumB);
        }
    }
}
