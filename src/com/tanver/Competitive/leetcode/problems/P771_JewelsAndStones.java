package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P771_JewelsAndStones {

    public int numJewelsInStones1(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()) set.add(ch);
        int counter = 0;
        for (char ch : stones.toCharArray())
            if (set.contains(ch)) ++counter;
        return counter;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int[] alphabet = new int[52];
        for (char ch : jewels.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z')
                alphabet[ch - 'A']++;
            else
                alphabet[ch - 'a' + 26]++;
        }
        int counter = 0;
        for (char ch : stones.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z' && alphabet[ch - 'A'] > 0)
                counter++;
            else if (ch >= 'a' && ch <= 'z' && alphabet[ch - 'a' + 26] > 0)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new P771_JewelsAndStones().
                numJewelsInStones2("Iut", "HTF"));
    }

}
