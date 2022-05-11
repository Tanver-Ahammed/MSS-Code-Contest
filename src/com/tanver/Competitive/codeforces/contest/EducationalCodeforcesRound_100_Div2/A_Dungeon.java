package com.tanver.Competitive.codeforces.contest.EducationalCodeforcesRound_100_Div2;

import java.util.Scanner;

public class A_Dungeon {
    private static void isCleanDungeon(int a, int b, int c) {
        if (a >= 3 && b >= 2 && c >= 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int a, b, c;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            isCleanDungeon(a, b, c);
        }
    }
}
