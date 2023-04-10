package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P151_ReverseWordsInAString {

    public String reverseWords1(String s) {
        int len = s.length();
        StringBuilder sentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (word.length() == 0)
                    continue;
                sentence.append(word.reverse()).append(' ');
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }
        if (word.length() != 0)
            return sentence.append(word.reverse()).toString();
        return sentence.substring(0, sentence.length() - 1);
    }

    public String reverseWords2(String s) {
        List<String> words = Arrays.asList(s.trim().split(" "));
        Collections.reverse(words);
        StringBuilder sb = new StringBuilder();
        for (String w : words) if (w.length() > 0) sb.append(w).append(" ");
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P151_ReverseWordsInAString()
                .reverseWords1(" asdasd df f"));
        System.out.println(new P151_ReverseWordsInAString()
                .reverseWords2(" asdasd df f"));
    }

}
