package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P242_ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : t.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1)
                    map.remove(ch);
                else
                    map.put(ch, map.getOrDefault(ch, 0) - 1);
            } else
                return false;
        }
        return map.size() == 0;
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] letter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            letter[s.charAt(i) - 'a']++;
            letter[t.charAt(i) - 'a']--;
        }
        for (int num : letter) {
            if (num != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P242_ValidAnagram().isAnagram2("anagram", "nagaram"));
    }

}
