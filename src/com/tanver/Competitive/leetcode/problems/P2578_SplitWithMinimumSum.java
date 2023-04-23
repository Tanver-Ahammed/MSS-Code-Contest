package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2578_SplitWithMinimumSum {

    public int splitNum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for (int i = 0; i < digits.length; i += 2) num1.append(digits[i]);
        for (int i = 1; i < digits.length; i += 2) num2.append(digits[i]);
        return Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
    }

}
