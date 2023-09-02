package com.tanver.Competitive.ostad.app.recursion;

public class PalindromeString {

    private boolean isPalindrome(String word, int left, int right) {
        if (left > right)
            return true;
        if (word.charAt(left) != word.charAt(right))
            return false;
        return isPalindrome(word, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String word = "tenet";
        System.out.println(new PalindromeString().isPalindrome(word, 0, word.length() - 1));

    }

}
