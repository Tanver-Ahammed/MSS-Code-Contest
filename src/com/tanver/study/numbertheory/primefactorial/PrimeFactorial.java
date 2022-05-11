package com.tanver.study.numbertheory.primefactorial;

public class PrimeFactorial {
    private static void primeFactors(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n = n / i;
                }
                System.out.println(i + " ^ " + count);
            }
        }
        if (n > 1)
            System.out.println(n + " ^ " + 1);
    }

    public static void main(String[] args) {
        primeFactors(377);
    }
}
