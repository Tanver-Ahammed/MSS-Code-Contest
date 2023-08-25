package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_23_LetterToNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String input = scanner.next();
            for (char ch : input.toCharArray()) {
                System.out.print(ch - 'A' + 1);
            }
            System.out.println();
        }
    }

}
