package com.tanver.Competitive.leetcode.problems;

public class P367_ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = (int) Math.sqrt(num);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int sqrt = mid * mid;
            if (sqrt == num)
                return true;
            else if (sqrt < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new P367_ValidPerfectSquare().isPerfectSquare(152399025));
    }

}
