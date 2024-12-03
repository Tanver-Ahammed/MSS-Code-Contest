package com.tanver.Competitive.leetcode.problems;

/*
Input: s = "LeetcodeHelpsMeLearn", spaces = [8,13,15]
Output: "Leetcode Helps Me Learn"
* */

public class P2109_AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        if (spaces.length == 0) {
            return s;
        }
        if (spaces[0] == 0) {
            builder.append(" ");
            index++;
        }
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i));
            if (index < spaces.length && i + 1 == spaces[index]) {
                builder.append(" ");
                index++;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        P2109_AddingSpacesToAString obj = new P2109_AddingSpacesToAString();
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {0, 8, 13, 15};
        System.out.println(obj.addSpaces(s, spaces));
    }
}
