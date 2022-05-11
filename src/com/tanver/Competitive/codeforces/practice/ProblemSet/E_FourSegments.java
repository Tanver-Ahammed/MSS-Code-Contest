package com.tanver.Competitive.codeforces.practice.ProblemSet;

import java.util.Arrays;
import java.util.Scanner;

public class E_FourSegments {
    private static void areaOfRec(int[] a) {
        int length, width;
        length = Math.min(a[0], a[1]);
        width = Math.min(a[2], a[3]);
        System.out.println(length * width);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int[] a = new int[4];
            for (int i = 0; i < a.length; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            areaOfRec(a);
        }
    }
}
