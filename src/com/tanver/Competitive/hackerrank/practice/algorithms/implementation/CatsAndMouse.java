package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int diffOfA = Math.abs(a - c);
            int diffOfB = Math.abs(b - c);

            if (diffOfA < diffOfB)
                System.out.println("Cat A");
            else if (diffOfA > diffOfB)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }
    }
}
