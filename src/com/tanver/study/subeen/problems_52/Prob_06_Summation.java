package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_06_Summation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            int sum = number % 10;
            number /= 10;
            while (number != 0) {
                int digit = number % 10;
                number /= 10;
                if (number == 0)
                    sum += digit;
            }
            System.out.println("Sum = " + sum);
        }
    }

}
