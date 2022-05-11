package com.tanver.Competitive.bee;

import java.util.Scanner;

public class BEE_1273_Justifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0)
                break;
            String[] strings = new String[n];
            int maxLen = 0;
            for (int i = 0; i < strings.length; i++) {
                strings[i] = scanner.next();
                int len = strings[i].length();
                if (len > maxLen)
                    maxLen = len;
            }

            for (int i = 0; i < n; i++) {
                int temp = maxLen - strings[i].length();
                for (int j = 0; j < temp; j++) {
                    System.out.print(" ");
                }
                System.out.println(strings[i]);
            }
            System.out.println();
        }
    }
}
