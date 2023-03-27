package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P345_ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!isVowel(ch[left]))
                left++;
            if (!isVowel(ch[right]))
                right--;
            if (isVowel(ch[left]) && isVowel(ch[right])) {
                char temp = ch[right];
                ch[right] = ch[left];
                ch[left] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        System.out.println(new P345_ReverseVowelsOfAString().reverseVowels("hello"));
        System.out.println(new P345_ReverseVowelsOfAString().reverseVowels("leetcode"));
        System.out.println(new P345_ReverseVowelsOfAString().reverseVowels("aA"));
    }

}
