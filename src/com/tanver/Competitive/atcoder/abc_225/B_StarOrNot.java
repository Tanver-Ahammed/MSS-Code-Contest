package com.tanver.Competitive.atcoder.abc_225;

import java.util.Scanner;

public class B_StarOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int n = scanner.nextInt();
        int[] a = new int[n - 1];
        int[] b = new int[n - 1];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        int[] result = new int[n + 1];

        for (int i = 0; i < a.length; i++) {
            result[a[i]]++;
            result[b[i]]++;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] == (n - 1)) {
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
