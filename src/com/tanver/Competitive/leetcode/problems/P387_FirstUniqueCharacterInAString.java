package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P387_FirstUniqueCharacterInAString {

    public int firstUniqChar1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public int firstUniqChar2(String s) {
        int ans = s.length();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = s.indexOf(ch);
            if (index != -1 && index == s.lastIndexOf(ch)) {
                ans = Math.min(ans, index);
            }
        }
        return ans == s.length() ? -1 : ans;
    }

    public static void main(String[] args) {

    }

}
