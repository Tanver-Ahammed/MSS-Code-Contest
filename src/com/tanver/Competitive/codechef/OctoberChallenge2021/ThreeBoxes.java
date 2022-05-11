package com.tanver.Competitive.codechef.OctoberChallenge2021;

import java.util.Scanner;

public class ThreeBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            if (a + b + c <= d)
                System.out.println(1);
            else if ((a + c <= d && b <= d) || (a + b <= d && c <= d))
                System.out.println(2);
            else
                System.out.println(3);
        }
    }
}
