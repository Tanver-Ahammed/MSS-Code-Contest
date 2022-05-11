package com.tanver.Competitive.codechef.januaryChallenge21div3;

import java.util.Scanner;

public class Chef_and_Division_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n, k, d, sum = 0, result = 0;
            n = scanner.nextInt();
            k = scanner.nextInt();
            d = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
                sum += a[i];
            }
            result = sum / k;
            if (result > d)
                result = d;

            System.out.println(result);
        }
    }
}
