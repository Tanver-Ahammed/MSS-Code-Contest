package com.tanver.Competitive.codeforces.practice.ProblemSet;

import java.util.Scanner;

public class A_1593 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == b && b == c) {
                System.out.println(a + 1 + " " + b + 1 + " " + c);
            }
            else {
                
            }
        }
    }
}
