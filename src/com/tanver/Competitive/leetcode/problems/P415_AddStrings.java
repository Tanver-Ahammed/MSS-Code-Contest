package com.tanver.Competitive.leetcode.problems;

import java.math.BigInteger;

public class P415_AddStrings {

    public String addStrings(String num1, String num2) {
        BigInteger bNum1 = new BigInteger(num1);
        BigInteger bNum2 = new BigInteger(num2);
        bNum1 = bNum1.add(bNum2);
        return bNum1.toString();
    }

    public String addStrings2(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (len1 > -1 || len2 > -1) {
            int sum = carry;
            if (len1 > -1) {
                sum += (num1.charAt(len1) - 48);
                --len1;
            }
            if (len2 > -1) {
                sum += (num2.charAt(len2) - 48);
                --len2;
            }
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new P415_AddStrings().isPowerOfThree(1));
    }

    public boolean isPowerOfThree(int n) {
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
}
