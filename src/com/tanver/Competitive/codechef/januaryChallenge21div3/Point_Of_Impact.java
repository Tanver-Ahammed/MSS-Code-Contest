package com.tanver.Competitive.codechef.januaryChallenge21div3;

import java.util.Scanner;

public class Point_Of_Impact {
    private static void findTheKthPoint(int n, int k, int x, int y) {
        int temp = 0, diff = 0;
        temp = k % 4;
        diff = x - y;

        if (x==n)
            temp++;

        if (temp == 1)
            System.out.println(n + " " + (n - diff));
        else if (temp == 2)
            System.out.println((n - diff) + " " + n);
        else if (temp == 3)
            System.out.println(0 + " " + diff);
        else
            System.out.println(diff + " " + 0);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCse = scanner.nextInt();
        while (testCse-- > 0) {
            int n, k, x, y;
            n = scanner.nextInt();
            k = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (y - x >= 0) {
                int temp = 0;
                temp = y - x;
                System.out.println(n - temp + " " + n);
            } else if (x == n && y==0)
                System.out.println(x + " " + y);
            else
            findTheKthPoint(n, k, x, y);
        }
    }
}
