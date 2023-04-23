package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P2399_CheckDistancesBetweenSameLetters {

    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> map = new HashMap<>();
        int[] charDistance = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int prevIndex = map.get(ch);
                charDistance[ch - 'a'] = i - prevIndex - 1;
            } else
                map.put(ch, i);
        }
        for (int i = 0; i < 26; i++) {
            if (map.containsKey((char) ('a' + i)) && distance[i] != charDistance[i])
                return false;
        }
        map.clear();
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P2399_CheckDistancesBetweenSameLetters().checkDistances(
                "abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        ));
    }

}
