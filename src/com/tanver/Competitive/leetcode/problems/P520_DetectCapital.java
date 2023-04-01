package com.tanver.Competitive.leetcode.problems;

public class P520_DetectCapital {

    public boolean detectCapitalUse(String word) {
        int capital = 0;
        int small = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z')
                ++capital;
            else
                ++small;
        }
        return capital == 0 || small == 0 ||
                (capital == 1 && Character.isUpperCase(word.charAt(0)));
    }

    public static void main(String[] args) {

    }
}
