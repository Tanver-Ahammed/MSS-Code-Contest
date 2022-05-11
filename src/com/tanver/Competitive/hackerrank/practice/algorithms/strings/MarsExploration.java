package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sosSignal = scanner.next();
        int count = 0;
        for (int i = 0; i < sosSignal.length(); i += 3) {

            if (sosSignal.charAt(i) != 'S') {
                count = count + 1;
            }
            if (sosSignal.charAt(i + 1) != 'O') {
                count = count + 1;
            }
            if (sosSignal.charAt(i + 2) != 'S') {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
