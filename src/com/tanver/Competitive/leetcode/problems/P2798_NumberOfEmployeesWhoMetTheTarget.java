package com.tanver.Competitive.leetcode.problems;

public class P2798_NumberOfEmployeesWhoMetTheTarget {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int hour : hours) {
            if (hour >= target)
                ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {

    }

}
