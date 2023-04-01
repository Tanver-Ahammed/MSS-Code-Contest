package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P389_FindTheDifference {

    public char findTheDifference1(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : t.toCharArray()) {
            int numOfChar = map.getOrDefault(ch, 0);
            if (numOfChar == 1)
                map.remove(ch);
            else
                map.put(ch, numOfChar - 1);
        }
        Iterator<Character> iterator = map.keySet().iterator();
        return iterator.next();
    }

    public char findTheDifference2(String s, String t) {
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (i < s.length()) {
                index = s.charAt(i) - 'a';
                char1[index]++;
            }
            index = t.charAt(i) - 'a';
            char2[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (char1[i] != char2[i])
                index = i;
        }
        return (char) (index + 97);
    }

    public static void main(String[] args) {

    }

}
