package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  200 B. Drinks
*/
import java.util.Scanner;

public class B_200 {
    private static void drink(int []a){
        double sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.printf("%.4f\n",sum/a.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        drink(a);
    }
}
