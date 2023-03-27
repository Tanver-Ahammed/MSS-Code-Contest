package com.tanver.Competitive.leetcode.problems;

public class P409_LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] letter = new int[52];
        boolean isOdd = false;
        int totalCharacter = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch))
                letter[ch - 71]++;
            else
                letter[ch - 65]++;
        }
        for (int num : letter) {
            if (num % 2 == 0)
                totalCharacter += num;
            else {
                if (isOdd)
                    totalCharacter += num - 1;
                else {
                    totalCharacter += num;
                    isOdd = true;
                }
            }
        }
        return totalCharacter;
    }

    public static void main(String[] args) {
        System.out.println(new P409_LongestPalindrome().longestPalindrome("AAAioj"));
    }

}
