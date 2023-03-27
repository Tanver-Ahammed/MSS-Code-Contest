package com.tanver.Competitive.leetcode.problems;

public class P326_PowerOfThree {

    public boolean isPowerOfThree1(int n) {
        if (n == 1)
            return true;
        if (n % 3 != 0)
            return false;
        int temp = 0;
        int i = 0;
        while (temp <= n) {
            temp = (int) Math.pow(3, i);
            if (temp == n)
                return true;
            if (n > 0)
                i++;
            else
                return false;
        }
        return false;
    }

    public boolean isPowerOfThree2(int n) {
        if (n == 1 || n == 3)
            return true;
        while (n >= 3) {
            if (n == 3 || n == 9)
                return true;
            else if (n % 9 != 0)
                return false;
            n = n / 9;

        }
        return false;
    }

    public boolean isPowerOfThree3(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
