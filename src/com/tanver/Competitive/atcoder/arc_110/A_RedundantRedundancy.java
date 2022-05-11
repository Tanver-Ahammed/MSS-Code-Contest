package com.tanver.Competitive.atcoder.arc_110;

import java.util.Scanner;

public class A_RedundantRedundancy {
    private static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    private static void redundancy(long n){
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans=lcm(ans,i);
        }
        System.out.println(ans+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        redundancy(scanner.nextInt());
    }
}
