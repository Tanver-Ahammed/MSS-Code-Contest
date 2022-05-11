package com.tanver.Competitive.codechef.DSALearningSeries.ComplexityAnalysis;

import java.util.Scanner;

public class LifeTheUniverseEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 100000; i++) {
            int n = scanner.nextInt();
            if (n==42)
                break;
            else
                System.out.println(n);
        }
    }
}
