package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String st = scanner.next();

        int seaLevel = 0;
        boolean belowSea = false;
        int valleys = 0;
        for (char ch : st.toCharArray()) {
            if (ch == 'U')
                seaLevel++;
            else
                seaLevel--;

            if (!belowSea && seaLevel < 0) {
                valleys++;
                belowSea = true;
            }

            if (seaLevel >= 0)
                belowSea = false;
        }
        System.out.println(Math.abs(valleys));
    }
}
