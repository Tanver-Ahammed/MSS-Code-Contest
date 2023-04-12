package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class P692_TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> freq = new HashMap<>();
        for (String word : words) freq.put(word, freq.getOrDefault(word, 0) + 1);
        List<String> res = new ArrayList<>(freq.keySet());
        res.sort((w1, w2) -> freq.get(w1).equals(freq.get(w2)) ?
                w1.compareTo(w2) : freq.get(w2) - freq.get(w1));
        return res.subList(0, k);
    }

    public static void main(String[] args) {

    }

}
