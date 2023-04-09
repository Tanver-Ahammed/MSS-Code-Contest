package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.HashMap;

public class P2325_DecodeTheMessage {

    public String decodeMessage1(String key, String message) {
        int len = key.length();
        StringBuilder res = new StringBuilder();
        ArrayList<Character> keyWithoutDuplicates = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            char c = key.charAt(i);
            if (!keyWithoutDuplicates.contains(c) && c != ' ')
                keyWithoutDuplicates.add(c);
        }
        len = message.length();
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                res.append(" ");
                continue;
            }
            int index = keyWithoutDuplicates.indexOf(ch);
            res.append((char) ('a' + index));
        }
        return res.toString();
    }

    public String decodeMessage2(String key, String message) {
        StringBuilder ans = new StringBuilder();
        key = key.replaceAll(" ", "");
        HashMap<Character, Character> letters = new HashMap<>();
        char original = 'a';
        for (char ch : key.toCharArray()) {
            if (!letters.containsKey(ch))
                letters.put(ch, original++);
        }
        for (char ch : message.toCharArray()) {
            if (letters.containsKey(ch))
                ans.append(letters.get(ch));
            else
                ans.append(ch);

        }
        return ans.toString();
    }

    public static void main(String[] args) {

    }

}
