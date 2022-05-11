package com.tanver.Competitive.hackerrank.practice.java;

import java.util.Scanner;

public class JavaDataTypes {
    private static void checkDataType(Long value) {
        if (-128 <= value && value <= 127)
            System.out.println("* byte");
        if (-32768 <= value && value <= 32767)
            System.out.println("* short");
        if (-2147483648 <= value && value <= 2147483647)
            System.out.println("* int");
        if (true)
            System.out.println("* long");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            Long value;
            try {
                value = scanner.nextLong();
                System.out.println(value + " can be fitted in:");
                checkDataType(value);
            } catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
