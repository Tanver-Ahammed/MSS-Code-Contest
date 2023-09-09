package com.tanver.Competitive.leetcode.problems;

public class P1551_MinimumOperationsToMakeArrayEqual {

    // Time Complexity: O(n), Space Complexity: O(1)
    public int minOperations1(int n) {
        int operation = 0;
        for (int i = 0; i < n / 2; i++) {
            int a = 2 * i + 1;
            int b = 2 * (n - i - 1) + 1;
            int diff = b - a;
            operation += diff / 2;
            // System.out.println(a + " " + b);
        }
        return operation;
    }

    // Time Complexity: O(n), Space Complexity: O(1)
    public int minOperations2(int n) {
        if (n % 2 == 0)
            return n / 2 * n / 2;
        int operation = 0;
        for (int i = 0; i < n / 2; i++) {
            int a = 2 * i + 1;
            int b = 2 * (n - i - 1) + 1;
            int diff = b - a;
            operation += diff / 2;
            // System.out.println(a + " " + b);
        }
        return operation;
    }

    // Time Complexity: O(1), Space Complexity: O(1)
    public int minOperations3(int n) {
        if (n % 2 == 0)
            return n / 2 * n / 2;
        else
            return ((n - 1) / 2) * ((n + 1) / 2);
    }

    public static void main(String[] args) {
        System.out.println(new P1551_MinimumOperationsToMakeArrayEqual().minOperations1(10));
        System.out.println(new P1551_MinimumOperationsToMakeArrayEqual().minOperations2(10));
        System.out.println(new P1551_MinimumOperationsToMakeArrayEqual().minOperations3(10));
    }

}
