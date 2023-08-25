package com.tanver.study.subeen.problems_52;

import java.util.Arrays;
import java.util.Scanner;

public class Prob_08_SmallToLarge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int[] arr = {a, b, c};
            Arrays.sort(arr);
            System.out.println("Case " + (i + 1) + ": " + arr[0] + " " + arr[1] + " " + arr[2]);
        }
    }

}
