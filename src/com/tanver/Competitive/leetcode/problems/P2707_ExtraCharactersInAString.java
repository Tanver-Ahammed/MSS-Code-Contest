package com.tanver.Competitive.leetcode.problems;

public class P2707_ExtraCharactersInAString {

    public int minExtraChar(String s, String[] dictionary) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new P2707_ExtraCharactersInAString().removeTrailingZeros("123000"));
    }

    public String removeTrailingZeros(String num) {
        int len = num.length(), i = 0;
        for (i = len - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (ch != '0')
                break;
        }
        return num.substring(0, i + 1);
    }

}
