package com.tanver.Competitive.gfg.problems;

public class ReverseWord {

    public static String reverseWord(String str) {
        // Reverse the string str
        int left = 0;
        int right = str.length() - 1;
        char[] chrs = str.toCharArray();
        while (left < right) {
            char temp = chrs[left];
            chrs[left] = chrs[right];
            chrs[right] = temp;
            ++left;
            --right;
        }
        return new String(chrs);
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Tanver"));
    }

}
