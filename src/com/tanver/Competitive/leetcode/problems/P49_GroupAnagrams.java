package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P49_GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] frequency = new char[26];
            for (char ch : word.toCharArray())
                frequency[ch - 'a']++;
            String key = new String(frequency);
            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(new P49_GroupAnagrams().groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

}
