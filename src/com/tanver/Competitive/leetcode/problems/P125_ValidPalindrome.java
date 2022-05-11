package com.tanver.Competitive.leetcode.problems;

public class P125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        boolean flag = false;
        StringBuilder sb = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String original = sb.toString();
        String reverse = sb.reverse().toString();
        if (original.equalsIgnoreCase(reverse))
            flag = true;
        return flag;
    }

    public static void main(String[] args) {
        P125_ValidPalindrome obj = new P125_ValidPalindrome();
        System.out.println(obj.isPalindrome("0P"));
    }
}
