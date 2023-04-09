package com.tanver.Competitive.leetcode.problems;

public class P2490_CircularSentence {

    public boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1))
                return false;
        }
        return sentence.charAt(0) == sentence.charAt(len - 1);
    }

    public static void main(String[] args) {
        System.out.println(new P2490_CircularSentence().isCircularSentence("leetcode exercises sound delightful"));
    }

}
