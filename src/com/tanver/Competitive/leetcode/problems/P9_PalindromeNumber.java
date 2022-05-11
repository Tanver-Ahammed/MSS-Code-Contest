package com.tanver.Competitive.leetcode.problems;

public class P9_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            int main_value = x;
            int temp = 0;
            while (x != 0) {
                int last_digit = x % 10;
                temp = temp * 10 + last_digit;
                x /= 10;
            }
            if (main_value == temp)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        P9_PalindromeNumber obj = new P9_PalindromeNumber();
        System.out.println(obj.isPalindrome(121));
    }
}
