package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        String result = "";
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (minLength > str.length())
                minLength = str.length();
        }

        aa:
        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i))
                    break aa;
            }
            result += strs[0].charAt(i);
        }

        System.out.println(minLength);
        return result;
    }

    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) == last.charAt(index))
                ++index;
            else
                break;
        }
        return first.substring(0, index);
    }

    public static void main(String[] args) {



    }

}
