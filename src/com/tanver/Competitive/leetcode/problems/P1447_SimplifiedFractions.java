package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P1447_SimplifiedFractions {

    public List<String> simplifiedFractions(int n) {
        List<String> results = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (gcd(i, j) != 1) continue;
                if (i == 1 || j % i != 0)
                    results.add(i + "/" + j);
            }
        }
        return results;
    }

    private int gcd(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (a != b) {
            if (b == 0)
                break;
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(new P1447_SimplifiedFractions().simplifiedFractions(6));
    }

}
