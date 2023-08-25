package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_02_EvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            String number = scanner.next();
            int lastDigit = number.charAt(number.length() - 1);
            if (lastDigit % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }

}
