package com.tanver.Competitive.codechef.snackdown2021;

import java.util.Scanner;

public class TestMatchSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int[] matches = new int[5];
            int draw = 0, india = 0, england = 0;
            for (int i = 0; i < 5; i++) {
                matches[i] = scanner.nextInt();
                if (matches[i] == 0)
                    ++draw;
                else if (matches[i] == 1)
                    ++india;
                else
                    ++england;
            }
            if (india > england) System.out.println("INDIA");
            else if (england > india) System.out.println("ENGLAND");
            else System.out.println("DRAW");
        }
    }
}
