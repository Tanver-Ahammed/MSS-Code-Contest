package com.tanver.Competitive.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String st = scanner.next();

        int i = 0;
        int count = 0;
        while (i < st.length()-2) {
            if (st.substring(i,i+3).equals("010")) {
                count++;
                i+=3;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
