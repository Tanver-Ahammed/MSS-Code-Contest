package com.tanver.Competitive.leetcode.problems;

public class P557_ReverseWordsInAStringIII {

    public String reverseWords1(String s) {
        StringBuilder sentence = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sentence.append(' ').append(word.reverse());
                word.setLength(0);
            } else {
                word.append(ch);
            }
        }
        sentence.append(' ').append(word.reverse());
        return sentence.deleteCharAt(0).toString();
    }

    public String reverseWords2(String s) {
        StringBuilder sentence = new StringBuilder();
        String[] words = s.split("\\s+");
        for (String word : words) {
            sentence.append(' ').append(new StringBuilder(word).reverse());
        }
        return sentence.deleteCharAt(0).toString();
    }

    public static void main(String[] args) {
        System.out.println(new P557_ReverseWordsInAStringIII().reverseWords2("Let's take LeetCode contest"));
    }

}
