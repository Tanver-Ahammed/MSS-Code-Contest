package com.tanver.Competitive.codeforces.contest.codeforcesRound696Div2;

import java.util.Scanner;

public class B_DifferentDivisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer testCase = scanner.nextInt();
        while (testCase-- > 0) {
            Integer d, a = 0, b = 0;
            d = scanner.nextInt();
            a = d + 1;
            b = a + d;
            System.out.println(a * b);
        }
    }
}
