package com.tanver.Competitive.leetcode.problems;

public class P917_ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (!Character.isLetter(chars[left]) && left < right)
                ++left;
            while (!Character.isLetter(chars[right]) && left < right)
                --right;
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            ++left;
            --right;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new P917_ReverseOnlyLetters().reverseOnlyLetters("7_28"));
        System.out.println(new P917_ReverseOnlyLetters().reverseOnlyLetters("ab-cd"));
        System.out.println(new P917_ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(new P917_ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

}
