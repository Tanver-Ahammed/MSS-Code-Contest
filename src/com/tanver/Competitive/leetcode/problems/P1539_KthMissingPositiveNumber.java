package com.tanver.Competitive.leetcode.problems;

public class P1539_KthMissingPositiveNumber {

    public int findKthPositive(int[] arr, int k) {
        int missingNumberCounter = 0;
        int expectedNumber = 1;
        for (int num : arr) {
            if (num != expectedNumber) {
                int temp = num - expectedNumber;
                expectedNumber = num;
                missingNumberCounter += temp;
                if (missingNumberCounter >= k) {
                    return num - missingNumberCounter + k - 1;
                }
            }
            ++expectedNumber;
        }
        return expectedNumber + k - missingNumberCounter - 1;
    }

    public static void main(String[] args) {
        System.out.println(new P1539_KthMissingPositiveNumber().findKthPositive(new int[]{1,2,3,4,5}, 2));
    }

}
