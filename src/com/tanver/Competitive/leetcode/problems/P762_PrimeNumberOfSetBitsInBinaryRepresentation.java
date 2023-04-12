package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P762_PrimeNumberOfSetBitsInBinaryRepresentation {

    public int countPrimeSetBits(int left, int right) {
        Set<Integer> primes = new HashSet<>(Arrays.
                asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            int bits = 0;
            for (int n = i; n > 0; n >>= 1)
                bits += n & 1;
            cnt += primes.contains(bits) ? 1 : 0;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new P762_PrimeNumberOfSetBitsInBinaryRepresentation()
                .countPrimeSetBits(2, 5));
    }

}
