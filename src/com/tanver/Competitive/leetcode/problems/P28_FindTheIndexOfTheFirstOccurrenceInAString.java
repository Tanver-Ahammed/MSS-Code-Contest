package com.tanver.Competitive.leetcode.problems;

public class P28_FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public int strStr2(String haystack, String needle) {
        int s2l = needle.length();
        if (haystack.length() == needle.length())
            if (haystack.equals(needle))
                return 0;

        for (int i = 0; i < haystack.length() - s2l + 1; i++) {
            if (haystack.substring(i, i + s2l).equals(needle))
                return i;
        }
        return -1;
    }

    public int strStr3(String haystack, String needle) {
        int index = -1;
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i < haystackLength; i++) {
            int j = i;
            int k = 0;
            while (j < haystackLength && k < needleLength) {
                if (haystack.charAt(j) != needle.charAt(k))
                    break;
                j++;
                k++;
            }
            if (k == needle.length()) {
                index = i;
                break;
            }
        }
        return index;
    }


}
