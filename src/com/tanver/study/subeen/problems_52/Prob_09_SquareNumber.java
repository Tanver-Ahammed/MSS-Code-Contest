package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_09_SquareNumber {

    private static boolean isSqNum(int num) {
        int sq = (int) Math.sqrt(num);
        return sq * sq == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int number = scanner.nextInt();
            if (isSqNum(number))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

}
