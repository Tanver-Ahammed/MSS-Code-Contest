package com.tanver.Competitive.hackerrank.practice.algorithms.bitManipulation;

import java.util.Scanner;

public class FlippingBits {
    private static void flipConvert(Long n) {
        String binVal = null;
        String convBinVal = null;
        binVal = Long.toBinaryString(n);
        int len = binVal.length();
        char[] arr = new char[32];

        for (int i = 0, j = 32 - len; i < len; i++, j++) {
            char ch = binVal.charAt(i);
            if (ch == '0') {
                arr[j] = '1';
            } else {
                arr[j] = '0';
            }
        }
        if (len < 32) {
            for (int i = 0; i < 32 - len; i++) {
                arr[i] = '1';
            }
        }

        convBinVal = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            String st = String.valueOf(arr[i]);
            convBinVal += st;
        }
        Long result = Long.parseLong(convBinVal, 2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            Long number = scanner.nextLong();
            flipConvert(number);
        }
    }
}
