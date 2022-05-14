package com.tanver.Competitive.leetcode.problems;

public class P792_NumberMatchingSubsequences {

    private static boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index)) {
                ++index;
            }
            if (index == s.length())
                return true;
        }
        return false;
    }

    public int numMatchingSubseq(String s, String[] words) {
        int countNumMatching = 0;
        for (String word : words) {
            if (word.length() > s.length()) continue;
            if (isSubsequence(word, s))
                ++countNumMatching;
        }
        return countNumMatching;
    }

    public static void main(String[] args) {
        String s = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        System.out.println(new P792_NumberMatchingSubsequences().numMatchingSubseq(s, words));
    }
}
