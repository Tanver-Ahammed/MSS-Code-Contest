package com.tanver.Competitive.leetcode.problems;

public class P2520_CountTheDigitsThatDivideANumber {

    public int countDigits(int num) {
        int counter = 0;
        int temp = num;
        while (temp != 0) {
            if (num % (temp % 10) == 0)
                ++counter;
            temp /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        P2520_CountTheDigitsThatDivideANumber obj = new P2520_CountTheDigitsThatDivideANumber();
    }
}

