package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int numReceived = 0;
        int num = 5;
        while (day >= 1) {
            int newNum = num / 2;
            numReceived += newNum;
            num = newNum * 3;
            day--;
        }
        System.out.println(numReceived);
    }
}
