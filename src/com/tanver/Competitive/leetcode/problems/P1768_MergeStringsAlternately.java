package com.tanver.Competitive.leetcode.problems;

public class P1768_MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        sb.append(word1.substring(i));
        sb.append(word2.substring(j));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P1768_MergeStringsAlternately().
                mergeAlternately("abcaa", "pqroo584"));
    }

}
