package com.tanver.study.numbertheory.binaryexponentiation;

public class BEBasic {
    private static void binaryExponentiation(int base, int power) {
        int result = 1;
        while (power != 0) {
            if (power % 2 == 0) {
                base = base * base;
                power = power / 2;
            } else {
                result = result * base;
                power--;
            }
            System.out.println(result + " " + base + " " + power);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int base = 2, power = 10;

        binaryExponentiation(base, power);

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}
