package com.tanver.Competitive.codechef.DecemberChallenge2021Div3;

import java.util.Scanner;

public class UtkarshAndPlacementTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            char a = scanner.next().charAt(0);
            char b = scanner.next().charAt(0);
            char c = scanner.next().charAt(0);

            char x = scanner.next().charAt(0);
            char y = scanner.next().charAt(0);

            if (a == x || a == y)
                System.out.println(a);
            else
                System.out.println(b);
        }
    }
}
