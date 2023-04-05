package com.tanver.Competitive.leetcode.problems;

import java.util.List;

public class P191_NumberOf1Bits {

    public int hammingWeight(int n) {
        int counter = 0;
        String binary = Integer.toBinaryString(n);
        for (char ch : binary.toCharArray()) {
            if (ch == '1')
                ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {

    }

}
