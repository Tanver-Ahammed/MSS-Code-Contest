package com.tanver.Competitive.codechef.AugustChallenge2021;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemDifficulties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int[] prob = new int[4];
            for (int i = 0; i < prob.length; i++) {
                prob[i] = scanner.nextInt();
            }
            Arrays.sort(prob);
            int checker = 0;
            for (int i = 0; i < prob.length - 1; i++) {
                if (prob[i] == prob[i + 1])
                    checker++;
            }
            if (checker == 3) System.out.println(0);
            else if (checker == 2) {
                if (prob[0] == prob[1] && prob[2] == prob[3])
                    System.out.println(2);
                else
                    System.out.println(1);
            } else if (checker == 1 || checker == 0) System.out.println(2);
        }
    }
}
