package com.tanver.Competitive.leetcode.problems;

public class P258_AddDigits {

    public int addDigits(int num) {
        while(true) {
            int sum = sumOfDigit(num);
            if (sum < 10)
                return sum;
            num = sum;
        }
    }

    private int sumOfDigit(int num) {
        int sum = 0;
        while (num > 9) {
            sum += num % 10;
            num /= 10;
        }
        sum += num;
        return sum;
    }

}
