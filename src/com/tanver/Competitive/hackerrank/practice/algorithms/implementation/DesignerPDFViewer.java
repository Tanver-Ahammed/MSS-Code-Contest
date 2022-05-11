package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] letter = new int[26];
        for (int i = 0; i < letter.length; i++) {
            letter[i] = scanner.nextInt();
        }
        String st = scanner.next();

        int max = 0;
        for (char ch : st.toCharArray()) {
            int temp = (int) ch;
            temp = letter[temp - 97];
            if (temp > max)
                max = temp;
        }
        System.out.println(max * st.length());
    }
}
