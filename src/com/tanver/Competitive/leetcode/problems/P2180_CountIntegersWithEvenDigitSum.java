package com.tanver.Competitive.leetcode.problems;

public class P2180_CountIntegersWithEvenDigitSum {

    public int countEven(int num) {
        int counterOfEvenSun = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int temp = i;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum % 2== 0)
                ++counterOfEvenSun;
        }
        return counterOfEvenSun;
    }

    public static void main(String[] args) {
        System.out.println(new P2180_CountIntegersWithEvenDigitSum().countEven(4));
        System.out.println(new P2180_CountIntegersWithEvenDigitSum().countEven(30));
    }

}
