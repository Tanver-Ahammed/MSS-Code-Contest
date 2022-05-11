package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_486 {
    private void calculatingFunction(long n) {
        if (n % 2 == 0)
            System.out.println(n / 2);
        else
            System.out.println(- (n+1)/2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long n = scanner.nextLong();
            new A_486().calculatingFunction(n);
        }
    }
}