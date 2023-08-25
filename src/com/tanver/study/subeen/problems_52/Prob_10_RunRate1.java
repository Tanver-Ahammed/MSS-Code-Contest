package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_10_RunRate1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int run = scanner.nextInt();
            int currRun = scanner.nextInt();
            int ball = scanner.nextInt();
            double currentRate = currRun / ((300 - ball) / 6.0);
            double needRate;
            if (currentRate > run)
                needRate = 0.00;
            else
                needRate = (run - currRun + 1) / (ball / 6.0);
            System.out.printf("%.2f %.2f\n", currentRate, needRate);
        }
    }

}
