package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P451_SortCharactersByFrequency {

    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        List<Integer> frequencies = new ArrayList<>(map.values());
        frequencies.sort(Comparator.reverseOrder());
        for (int frequency : frequencies) {
            for (char key : map.keySet()) {
                if (frequency == map.get(key)) {
                    result.append(String.valueOf(key).repeat(Math.max(0, map.get(key))));
                    map.remove(key);
                    break;
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P451_SortCharactersByFrequency()
                .frequencySort("TanverAhammedAminulBari"));
    }



}
