package com.tanver.Competitive.leetcode.problems;

public class P1945_SumOfDigitsOfStringAfterConvert {

    public int getLucky(String s, int k) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            int temp = ch - 'a' + 1;
            sum += temp % 10 + temp / 10;
        }
        --k;
        while (k-- > 0) {
            int temp = 0;
            while (sum != 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
            if (sum / 10 == 0)
                break;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new P1945_SumOfDigitsOfStringAfterConvert().getLucky("zbax", 1234567890));
    }

}
