package com.tanver.Competitive.leetcode.problems;

public class P1108_DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.')
                result.append("[.]");
            else
                result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }

}
