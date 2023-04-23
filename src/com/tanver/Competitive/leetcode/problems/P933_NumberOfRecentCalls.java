package com.tanver.Competitive.leetcode.problems;

import java.util.TreeMap;

public class P933_NumberOfRecentCalls {

    TreeMap<Integer, Integer> map;

    public P933_NumberOfRecentCalls() {
        map = new TreeMap<>();
    }

    public int ping(int t) {
        map.put(t, 1 + map.size());
        return map.tailMap(t - 3000).size();
    }

}
