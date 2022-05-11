package com.tanver.Competitive.codechef.decemberChallenge20;

import java.util.Scanner;

public class EvenPairSum {
    private static void pairOfSum(int a, int b) {
        int sum = 0, aEven, aOdd, bEven, bOdd;
        aEven = a / 2;
        aOdd = a - aEven;
        bEven = b / 2;
        bOdd = b - bEven;
        sum = aEven * bEven + aOdd * bOdd;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        while (testcase-- > 0) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            pairOfSum(a, b);
        }
    }
}
