package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.io.*;
import java.util.*;

class Result {

    public static int findDigits(int n) {
        int temp = n;
        int countOfDigit = 0;
        while(temp > 0) {
            int curDigit = temp % 10;
            if(curDigit != 0 && n % curDigit == 0) {
                countOfDigit++;
            }
            temp /= 10;
        }
        return countOfDigit;
    }

}

public class FindDigits {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-->0) {
            int number = scanner.nextInt();
            int result = Result.findDigits(number);
            System.out.println(result);
        }
    }
}
