package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_11_Factorial100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            long fact = 1;
            for (int i = 2; i <= n; i++)
                fact *= i;
            System.out.println(fact);
        }
    }

}
