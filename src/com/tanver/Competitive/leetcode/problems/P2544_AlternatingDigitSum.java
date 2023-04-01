package com.tanver.Competitive.leetcode.problems;

public class P2544_AlternatingDigitSum {

    public int alternateDigitSum(int n) {
        String temp = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (i % 2 == 0)
                sum += temp.charAt(i) - 48;
            else
                sum -= temp.charAt(i) - 48;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new P2544_AlternatingDigitSum().alternateDigitSum(124));
    }

}
