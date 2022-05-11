package com.tanver.Competitive.codeforces.practice.ProblemSet;

import java.util.Scanner;

public class A_1328_DivisibilityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a % b == 0) System.out.println(0);
            else {
                int temp = a % b;
                System.out.println(b - temp);
            }
        }
    }
}
