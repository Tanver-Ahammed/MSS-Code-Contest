package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P1941_CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int freq = 0;
        for (char ch : s.toCharArray()) {
            freq = map.getOrDefault(ch, 0) + 1;
            map.put(ch, freq);
        }

        for (int temp : map.values()) {
            if (temp != freq)
                return false;
        }
        return true;
    }

    public boolean areOccurrencesEqual2(String s) {
        int[] alphabet = new int[26];
        for (char ch : s.toCharArray())
            alphabet[ch - 'a']++;
        int freq = alphabet[s.charAt(0) - 'a'];
        for (int temp : alphabet) {
            if (temp == 0)
                continue;
            if (temp != freq)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P1941_CheckIfAllCharactersHaveEqualNumberOfOccurrences()
                .areOccurrencesEqual1("abacbc"));

        System.out.println(new P1941_CheckIfAllCharactersHaveEqualNumberOfOccurrences()
                .areOccurrencesEqual2("abacbc"));

    }

}
