package com.tanver.Competitive.leetcode.problems;

public class P824_GoatLatin {

    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int index = 1;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ' || i + 1 == sentence.length()) {
                if (i + 1 == sentence.length())
                    word.append(ch);
                ch = word.charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    result.append(word).append("ma");
                else {
                    result.append(word.substring(1)).append(ch).append("ma");
                }
                result.append("a".repeat(index));
                if (i + 1 != sentence.length())
                    result.append(" ");
                ++index;
                word.setLength(0);
            } else
                word.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P824_GoatLatin().
                toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

}
