package com.tanver.Competitive.codechef.NovemberChallenge2021Div3;

import java.util.Scanner;

public class EqualCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x % 2 == 0) {
                if (y % 2 == 0)
                    System.out.println("Yes");
                else {
                    if (x == 0)
                        System.out.println("No");
                    else
                        System.out.println("Yes");
                }
            } else {
                System.out.println("No");
            }

        }
    }
}
