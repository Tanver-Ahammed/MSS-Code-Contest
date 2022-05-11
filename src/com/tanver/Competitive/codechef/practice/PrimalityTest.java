package com.tanver.Competitive.codechef.practice;

import java.util.Scanner;

public class PrimalityTest {
    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            if (isPrime(number))
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
