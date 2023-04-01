package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P500_KeyboardRow {

    static final Set<Character> set1 = new HashSet<>(List.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
    static final Set<Character> set2 = new HashSet<>(List.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
    static final Set<Character> set3 = new HashSet<>(List.of('z', 'x', 'c', 'v', 'b', 'n', 'm'));

    public String[] findWords(String[] words) {
        int index = 0;

        for (String word : words) {
            boolean flag = true;
            short temp = get(Character.toLowerCase(word.charAt(0)));
            short prev;
            for (int i = 1; i < word.length(); i++) {
                prev = temp;
                char ch = Character.toLowerCase(word.charAt(i));
                temp = get(ch);
                if (prev != temp) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                words[index] = word;
                ++index;
            }
        }
        String[] results = new String[index];
        System.arraycopy(words, 0, results, 0, index);
        return results;
    }

    private short get(char ch) {
        if (set1.contains(ch))
            return 1;
        else if (set2.contains(ch))
            return 2;
        else if (set3.contains(ch))
            return 3;
        return 0;
    }

    public static void main(String[] args) {

    }

}
