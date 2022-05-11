package com.tanver.Competitive.codechef.AugustChallenge2021;

import java.util.Scanner;

public class OlympicsRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int g1, s1, b1, g2, s2, b2, total = 0;
            g1 = scanner.nextInt();
            s1 = scanner.nextInt();
            b1 = scanner.nextInt();
            g2 = scanner.nextInt();
            s2 = scanner.nextInt();
            b2 = scanner.nextInt();

            total = (g1 + s1 + b1) - (g2 + s2 + b2);

            if (total > 0) System.out.println(1);
            else if (total < 0) System.out.println(2);
            else System.out.println();
        }
    }
}
