package com.tanver.Competitive.leetcode.problems;

public class P1869_LongerContiguousSegmentsOfOnesThanZeros {

    public boolean checkZeroOnes(String s) {
        char prev = s.charAt(0);
        int maxOne = 0;
        int maxZero = 0;
        int tempOne = 0;
        int tempZero = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                if (prev == ch) {
                    ++tempOne;
                } else
                    tempOne = 1;
                if (tempOne > maxOne)
                    maxOne = tempOne;
            } else {
                if (prev == ch) {
                    ++tempZero;
                } else
                    tempZero = 1;
                if (tempZero > maxZero)
                    maxZero = tempZero;
            }
            prev = ch;
        }
        return maxOne > maxZero;
    }

    public static void main(String[] args) {
        System.out.println(new P1869_LongerContiguousSegmentsOfOnesThanZeros().
                checkZeroOnes("10011001"));
    }

}
