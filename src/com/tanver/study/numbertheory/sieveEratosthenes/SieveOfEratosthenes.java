package com.tanver.study.numbertheory.sieveEratosthenes;

public class SieveOfEratosthenes {
    private static void sieve(int n) {
        boolean[] primeList = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primeList[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primeList[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primeList[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeList[i])
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sieve(30);
    }
}
