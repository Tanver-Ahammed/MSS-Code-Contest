package com.tanver.Competitive.leetcode.problems;

public class P1796_SecondLargestDigitInAString {

    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        int counter = 0;
        for (char ch : s.toCharArray()) {
            if (!(ch >= '0' && ch <= '9'))
                continue;
            int num = ch - '0';
            if (num > max) {
                secondMax = max;
                max = num;
                ++counter;
            } else if (num > secondMax && num < max) {
                secondMax = num;
                ++counter;
            }
        }
        if (counter == 0)
            return -1;
        return counter == 1 ? -1 : secondMax;
    }

    public static void main(String[] args) {

    }

}
