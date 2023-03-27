package com.tanver.Competitive;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char firstChar;
        for (char ch : s.toCharArray()) {
            int count = map.getOrDefault(ch, 0) + 1;
            map.put(ch, count);
        }



        return -1;
    }
}