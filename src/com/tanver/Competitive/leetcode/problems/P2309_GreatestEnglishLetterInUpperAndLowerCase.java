package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P2309_GreatestEnglishLetterInUpperAndLowerCase {

    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray())
            set.add(ch);
        for (char ch = 'Z'; ch >= 'A'; ch--)
            if (set.contains(ch) && set.contains((char) ('a' + (ch - 'A'))))
                return String.valueOf(ch);
        return "";
    }

    public static void main(String[] args) {

    }

}
