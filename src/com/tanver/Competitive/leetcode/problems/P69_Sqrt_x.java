package com.tanver.Competitive.leetcode.problems;

import java.util.Scanner;

public class P69_Sqrt_x {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P69_Sqrt_x obj = new P69_Sqrt_x();
        System.out.println(obj.mySqrt(scanner.nextInt()));
    }
}
