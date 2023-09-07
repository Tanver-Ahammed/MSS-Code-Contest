package com.tanver.Competitive.leetcode.problems;

public class P2843_CountSymmetricIntegers {

    private boolean isSymmetric(String number) {
        int len = number.length();
        if (len % 2 != 0)
            return false;
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < len / 2; i++) {
            leftSum += number.charAt(i) - '0';
            rightSum += number.charAt(len - i - 1) - '0';
        }
        return leftSum == rightSum;
    }

    public int countSymmetricIntegers(int low, int high) {
        int counter = 0;
        for (int i = low; i <= high; i++) {
            String number = String.valueOf(i);
            if (isSymmetric(number)) ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {
    }
}
