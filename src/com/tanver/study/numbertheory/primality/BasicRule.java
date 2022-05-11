package com.tanver.study.numbertheory.primality;

import java.util.Scanner;

public class BasicRule {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        while (true) {
            int n = new Scanner(System.in).nextInt();
            if (isPrime(n))
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
    }
}
