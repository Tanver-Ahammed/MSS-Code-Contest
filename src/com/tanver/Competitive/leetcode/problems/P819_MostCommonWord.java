package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P819_MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for (String word : banned)
            set.add(word.toLowerCase());
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String result = "";
        int max = 0;
        for (char ch : paragraph.toCharArray()) {
            ch = Character.toLowerCase(ch);
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
            } else {
                if (!set.contains(sb.toString()) && !sb.isEmpty()) {
                    int freq = map.getOrDefault(sb.toString(), 0) + 1;
                    map.put(sb.toString(), freq);
                    if (freq > max) {
                        max = freq;
                        result = sb.toString();
                    }
                }
                sb.setLength(0);
            }
        }
        if (!set.contains(sb.toString())) {
            int freq = map.getOrDefault(sb.toString(), 0) + 1;
            map.put(sb.toString(), freq);
            if (freq > max)
                result = sb.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P819_MostCommonWord()
                .mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
    }

}
