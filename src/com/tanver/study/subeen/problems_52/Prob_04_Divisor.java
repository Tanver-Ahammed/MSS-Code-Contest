package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_04_Divisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int number = scanner.nextInt();
            System.out.print("Case " + (i + 1) + ": ");
            for (int j = 1; j <= number / 2; j++) {
                if (number % j == 0)
                    System.out.print(j + " ");
            }
            System.out.println(number);
        }
    }

}
