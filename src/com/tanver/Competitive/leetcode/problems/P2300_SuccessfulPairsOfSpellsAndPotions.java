package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P2300_SuccessfulPairsOfSpellsAndPotions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spells[i] * potions[mid] >= success)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            spells[i] = potions.length - left;
        }
        return spells;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2300_SuccessfulPairsOfSpellsAndPotions().successfulPairs(
                new int[]{5, 1, 3},
                new int[]{1, 2, 3, 4, 5},
                7
        )));
    }

}
