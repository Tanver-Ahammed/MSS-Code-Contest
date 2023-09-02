package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

public class P338_CountingBits {

    public int[] countBits1(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = bitCounter(i);
        }
        return result;
    }

    private int bitCounter(int num) {
        int counter = 0;
        String binary = Integer.toBinaryString(num);
        for (char ch : binary.toCharArray()) {
            if (ch == '1')
                ++counter;
        }
        return counter;
    }

    public int[] countBits2(int n) {
        int[] results = new int[n + 1];
        results[0] = 0;
        if (n > 0) {
            results[1] = 1;
        }
        if (n > 1) {
            int sum = 2;
            for (int i = 2; ; i *= 2) {
                for (int j = 0; j < i; j++) {
                    results[i + j] = results[j] + 1;
                    sum++;
                    if (sum == n + 1) {
                        break;
                    }
                }

                if (sum == n + 1) {
                    break;
                }
            }
        }
        return results;
    }

    public int[] countBits3(int n) {
        int[] counts = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            counts[i] = i % 2 + counts[i / 2];
        }
        return counts;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P338_CountingBits().countBits1(5)));
        System.out.println(Arrays.toString(new P338_CountingBits().countBits2(5)));
        System.out.println(Arrays.toString(new P338_CountingBits().countBits3(5)));
    }
}
