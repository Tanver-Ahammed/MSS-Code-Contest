package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        int countDivisible = 0;
        for (int i = a; i <= b; i++) {
            int realNum = i;
            int temp = realNum;
            int reverseNum = 0;
            while (temp != 0) {
                reverseNum = reverseNum * 10 + temp % 10;
                temp /= 10;
            }
            int diff = Math.abs(realNum - reverseNum);
            if (diff % k == 0)
                ++countDivisible;
        }
        System.out.println(countDivisible);
    }
}
