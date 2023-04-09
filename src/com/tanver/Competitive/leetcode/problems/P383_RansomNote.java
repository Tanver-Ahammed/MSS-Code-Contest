package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P383_RansomNote {


    public boolean canConstruct1(String ransomNote, String magazine) {
        int lenRan = ransomNote.length();
        int lenMag = magazine.length();
        if (lenRan > lenMag)
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : magazine.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : ransomNote.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.getOrDefault(ch, 0) - 1);
            } else
                return false;
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] alphabets = new int[26];
        for (char ch : magazine.toCharArray())
            alphabets[ch - 'a']++;
        for (char ch : ransomNote.toCharArray()) {
            if (alphabets[ch - 'a'] == 0)
                return false;
            else
                alphabets[ch - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P383_RansomNote().canConstruct1("aa", "aab"));
    }

}
