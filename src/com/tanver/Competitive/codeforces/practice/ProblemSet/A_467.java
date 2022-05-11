package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  467-A. George and Accommodation
*/
import java.util.Scanner;

public class A_467 {
    private static void countRoom(int []a,int []b){
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (b[i]-a[i]>=2)
                count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        int []b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        countRoom(a,b);
    }
}
