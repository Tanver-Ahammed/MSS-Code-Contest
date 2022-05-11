package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  A. Combination Lock
*/
import java.util.Scanner;

public class A_540 {
    private static int combinationLock(String st1, String st2) {
        int sum = 0;
        for (int i = 0; i < st1.length(); i++) {
            int a, b, temp;
            a = st1.charAt(i);
            b = st2.charAt(i);
            temp = Math.abs(a - b);
            if (temp > 5)
                temp = 10 - temp;
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            String st1, st2;
            st1 = scanner.next();
            st2 = scanner.next();
            int result = combinationLock(st1, st2);
            System.out.println(result);
        }
    }
}
