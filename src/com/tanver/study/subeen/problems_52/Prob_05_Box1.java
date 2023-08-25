package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_05_Box1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}
