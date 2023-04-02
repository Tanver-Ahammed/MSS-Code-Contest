package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P202_HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> sumSet = new HashSet<>();
        sumSet.add(n);
        while (n != 1 && sumSet.size() != n) {
            n = sumDigit(n);
            if (sumSet.contains(n))
                return false;
            sumSet.add(n);
        }
        return n == 1;
    }

    private int sumDigit(int num) {
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            sum += temp * temp;
            num /= 10;
        }
        return sum;
    }

}
