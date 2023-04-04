package com.tanver.Competitive.leetcode.problems;

import java.math.BigInteger;

public class P43_MultiplyStrings {

    public String multiply1(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n1).toString();
    }

    public String multiply2(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] prods = new int[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int p1 = i + j;
                int p2 = p1 + 1;
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + prods[p2];
                prods[p1] += mul / 10;
                prods[p2] = mul % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int prod : prods) {
            if (!(prod == 0 && sb.length() == 0))
                sb.append(prod);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P43_MultiplyStrings().multiply1("545454564", "56416551"));
        System.out.println(new P43_MultiplyStrings().multiply2("20", "20"));
    }

}
