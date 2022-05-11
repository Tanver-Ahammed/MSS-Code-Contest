package com.tanver.Competitive.codechef.snackdown2021;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 7 || b == 7 || c == 7)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
