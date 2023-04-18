package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class P290_WordPattern {

    public boolean wordPattern1(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split("\\s+");
        System.out.println(words.length);
        if (pattern.length() != words.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word))
                    return false;
            } else {
                if (map.containsValue(word))
                    return false;
                map.put(ch, word);
            }
        }
        return true;
    }

    public boolean wordPattern2(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i = 0; i < words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P290_WordPattern().wordPattern("aaaa", "dog dog dog dog"));
        System.out.println(new P290_WordPattern().wordPattern("abba", "dog cat cat fish"));
    }

}
