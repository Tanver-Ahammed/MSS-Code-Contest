package com.tanver.Competitive.leetcode.problems;

import java.util.Stack;

public class P2108_FindFirstPalindromicStringInTheArray {

    private boolean isPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return true;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word))
                return word;
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new P2108_FindFirstPalindromicStringInTheArray()
                .firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }

}
