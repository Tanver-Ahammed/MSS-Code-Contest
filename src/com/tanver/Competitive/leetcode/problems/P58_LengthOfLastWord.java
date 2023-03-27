package com.tanver.Competitive.leetcode.problems;

public class P58_LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean isStartChar = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(s.charAt(i))) {
                ++len;
                isStartChar = true;
            } else if (isStartChar) {
                break;
            }
        }
        return len;
    }

    public static void main(String[] args) {

    }

}
