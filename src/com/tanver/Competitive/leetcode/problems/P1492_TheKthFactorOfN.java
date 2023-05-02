package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P1492_TheKthFactorOfN {

    public int kthFactor1(int n, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                factors.add(i);
        }
        factors.add(n);
        if (factors.size() < k)
            return -1;
        return factors.get(k - 1);
    }

    public int kthFactor2(int n, int k) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                ++counter;
            if (counter == k)
                return i;
            if (i == n / 2)
                i = n - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new P1492_TheKthFactorOfN().kthFactor1(12, 7));
        System.out.println(new P1492_TheKthFactorOfN().kthFactor2(12, 7));
    }

}
