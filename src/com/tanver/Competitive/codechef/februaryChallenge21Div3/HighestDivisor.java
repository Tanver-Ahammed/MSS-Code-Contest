package com.tanver.Competitive.codechef.februaryChallenge21Div3;

import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 10; i > 0; i--) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
