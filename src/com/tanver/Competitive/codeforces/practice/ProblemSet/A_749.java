package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  749 A. Bachgold Problem
*/
import java.util.Scanner;

public class A_749 {
    private static void findPrime(int sumOfPrimeNum) {
        boolean flag = false;
        int numOfPrime = sumOfPrimeNum / 2;
        System.out.println(numOfPrime);
        if (sumOfPrimeNum % 2 == 0) {
            for (int i = 1; i < numOfPrime; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(2);
        } else {
            for (int i = 1; i < numOfPrime; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int sumOfPrimeNum = scanner.nextInt();
            findPrime(sumOfPrimeNum);
        }
    }
}
