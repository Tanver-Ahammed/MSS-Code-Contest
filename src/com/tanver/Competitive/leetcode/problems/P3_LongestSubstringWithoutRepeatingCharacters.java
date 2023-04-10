package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P3_LongestSubstringWithoutRepeatingCharacters {

    // abcabcbb
    public int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<>();
//        int maxLength = 0;
//        int counter = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (!set.contains(ch)) {
//                ++counter;
//                set.add(ch);
//                if (counter > maxLength)
//                    maxLength = counter;
//            } else {
//                counter = 1;
//                set.clear();
//                set.add(ch);
//            }
//        }
//        return maxLength;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new P3_LongestSubstringWithoutRepeatingCharacters()
                .lengthOfLongestSubstring("dvdf"));
    }

}
