package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P290_WordPattern {

    Map<Character, String> map = new HashMap<>();

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        StringBuilder word = new StringBuilder();
        int index = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                word.append(ch);
            } else {
                char pc = pattern.charAt(index);
                if (map.containsKey(pc) && !map.containsValue(word.toString()))
                    return false;
                if (map.containsKey(pc) && !map.get(pc).equals(word.toString())) {
                        return false;
                } else {
                    map.put(pc, word.toString());
                }
                ++index;
                word.setLength(0);
            }
        }
        char pc = pattern.charAt(index);
        return !map.containsKey(pc) || map.get(pc).equals(word.toString());
    }

    public static void main(String[] args) {
        System.out.println(new P290_WordPattern().wordPattern("abba", "dog dog dog dog"));
        System.out.println(new P290_WordPattern().wordPattern("abba", "dog cat cat fish"));
    }

}
