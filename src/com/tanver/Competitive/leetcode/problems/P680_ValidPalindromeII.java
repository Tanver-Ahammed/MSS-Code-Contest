package com.tanver.Competitive.leetcode.problems;

public class P680_ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindrome(s, left + 1, right) ||
                        isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P680_ValidPalindromeII().validPalindrome("abc"));
    }

}
