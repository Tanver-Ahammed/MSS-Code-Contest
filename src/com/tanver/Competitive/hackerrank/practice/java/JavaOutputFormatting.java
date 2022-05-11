package com.tanver.Competitive.hackerrank.practice.java;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int len = s1.length();
            int space = 15 - len;
            System.out.print(s1);
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            if (x / 100 >= 1) {
                System.out.println(x);
            } else if (x / 10 >= 1){
                System.out.println("0" + x);
            } else {
                System.out.println("00" + x);
            }
        }
        System.out.println("================================");
    }
}
