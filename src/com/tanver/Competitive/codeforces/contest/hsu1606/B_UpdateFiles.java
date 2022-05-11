package com.tanver.Competitive.codeforces.contest.hsu1606;

import java.util.Scanner;

public class B_UpdateFiles {
    private static long findOuTimes(long n, long k) {
        if (n == 1 && k == 1)
            return 0;
        long hours = 1;

        long computer = 2;
        while (computer < n) {
            if (computer < k)
                computer = computer + computer;
            else
                break;
            ++hours;
        }
        long temp = n - computer;
        if (temp > 0) {
            hours += temp / k;
        }
        if (temp > 0 && temp % k != 0)
            ++hours;
        return hours;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            System.out.println(findOuTimes(n, k));
        }
    }
}
