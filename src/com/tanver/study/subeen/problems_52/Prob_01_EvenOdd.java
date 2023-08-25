package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_01_EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }

}
