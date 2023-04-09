package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2177_FindThreeConsecutiveIntegersThatSumToAGivenNumber {

    public long[] sumOfThree(long num) {
        if (num % 3 != 0)
            return new long[]{};
        long divisor = num / 3;
        return new long[]{divisor - 1, divisor, divisor + 1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P2177_FindThreeConsecutiveIntegersThatSumToAGivenNumber().sumOfThree(51)));
    }

}
