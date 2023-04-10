package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P1897_RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        if (map.size() == 1)
            return true;
        if (map.size() > 3)
            return false;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new P1897_RedistributeCharactersToMakeAllStringsEqual()
                .makeEqual(new String[]{"bc", "abc", "aabc", "aabc", "abc", "bc"}));
    }

}
