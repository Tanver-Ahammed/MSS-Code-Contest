package com.tanver.Competitive.hackerrank.practice.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day10_BinaryNumbers {
    private static void findBinNumber(int num) {
        String binary = Integer.toBinaryString(num);
        ArrayList<Integer> sumList = new ArrayList<>();
        int sumOf1 = 0;
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                sumOf1++;
            } else {
                sumList.add(sumOf1);
                sumOf1 = 0;
            }
        }
        sumList.add(sumOf1);
        Collections.sort(sumList, Collections.reverseOrder());
        System.out.println(sumList.get(0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decNumber = scanner.nextInt();
        findBinNumber(decNumber);
    }
}
