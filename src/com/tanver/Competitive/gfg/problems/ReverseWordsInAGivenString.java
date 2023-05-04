package com.tanver.Competitive.gfg.problems;

public class ReverseWordsInAGivenString {

    String reverseWords(String S) {
        // code here
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int len = S.length();
        for (int i = len - 1; i >= 0; i--) {
            char ch = S.charAt(i);
            if (ch == '.') {
                result.append(word.reverse()).append('.');
                word.setLength(0);
            } else
                word.append(ch);
        }
        result.append(word.reverse());
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAGivenString().reverseWords("i.like.this.program.very.much"));
    }

}
