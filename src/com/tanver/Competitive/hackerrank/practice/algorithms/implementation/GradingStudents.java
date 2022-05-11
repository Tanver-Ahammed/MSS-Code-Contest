package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {
    private static void gradingCal(int number) {
        if (number < 38)
            System.out.println(number);
        else {
            int temp = number / 5;
            int val = (temp + 1) * 5;
            if (val - number < 3)
                System.out.println(val);
            else
                System.out.println(number);

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        while (n-- > 0){
            gradingCal(scanner.nextInt());
        }
    }
}
