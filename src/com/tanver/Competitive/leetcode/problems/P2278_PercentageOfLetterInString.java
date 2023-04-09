package com.tanver.Competitive.leetcode.problems;

public class P2278_PercentageOfLetterInString {

    public int percentageLetter(String s, char letter) {
        int charCounter = 0;
        for (char ch : s.toCharArray()) {
            if (ch == letter)
                ++charCounter;
        }
        return charCounter *100 / s.length();
    }

    public static void main(String[] args) {
        System.out.println(new P2278_PercentageOfLetterInString().percentageLetter("foobar", 'o'));
    }

}
