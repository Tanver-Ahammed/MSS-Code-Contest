package com.tanver.ostad.app;

public class SumOfFirstNNumbers {

    private int sumOf1ToN(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(new SumOfFirstNNumbers().sumOf1ToN(1000));
    }

}
