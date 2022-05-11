package com.tanver.Competitive.codechef.CodeNiumhallenge;

import java.util.Arrays;
import java.util.Scanner;

public class DivideStudentsIntoClasses {
    private static void isPossible(int[] heightOfStudent) {
        int len = heightOfStudent.length;
        if (len < 12) {
            System.out.println("no");
        } else {
            Arrays.sort(heightOfStudent);
            int count = 0;
            for (int i = 0; i < len - 1; i++) {
                if (heightOfStudent[i] != heightOfStudent[i + 1]) {
                    ++count;
                }
            }
            if (count < 12)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int n = scanner.nextInt();
            int[] heightOfStudent = new int[n];
            for (int i = 0; i < heightOfStudent.length; i++) {
                heightOfStudent[i] = scanner.nextInt();
            }
            isPossible(heightOfStudent);
        }
    }
}
