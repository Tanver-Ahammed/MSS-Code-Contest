package com.tanver.study.subeen.problems_52;

import java.util.Scanner;

public class Prob_07_CountNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            String line = scanner.nextLine();
            if (line.isEmpty())
                line = scanner.nextLine();
            int counter = 0;
            boolean flag = false;
            for (char ch : line.toCharArray()) {
                if (Character.isDigit(ch))
                    flag = true;
                else {
                    if (flag)
                        ++counter;
                    flag = false;
                }
            }
            if (flag)
                ++counter;
            System.out.println(counter);
        }
    }

}
