package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P438_FindAllAnagramsInAString {

    public static void main(String[] args) {
        System.out.println(new P438_FindAllAnagramsInAString().findAnagrams1("abab", "ab"));
    }

    // ------------Time Complexity O(N*26), Space Complexity O(1) using brute force-----------------------------
    public List<Integer> findAnagrams1(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        if (s.length() < p.length())
            return anagrams;
        int len = p.length();
        short[] pattern = this.stringFreq(p);
        short[] match = this.stringFreq(s.substring(0, len));
        if (this.matchString(pattern, match))
            anagrams.add(0);
        for (int i = 1; i + len <= s.length(); i++) {
            match[s.charAt(i - 1) - 'a']--;
            match[s.charAt(i + len - 1) - 'a']++;
            if (this.matchString(pattern, match))
                anagrams.add(i);
        }
        return anagrams;
    }

    private boolean matchString(short[] s1, short[] s2) {
        for (int i = 0; i < 26; i++) {
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }

    private short[] stringFreq(String s) {
        short[] freq = new short[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        return freq;
    }


}
