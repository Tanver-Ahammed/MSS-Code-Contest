package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  758 A. Holiday Of Equality
*/
import java.util.Arrays;
import java.util.Scanner;

public class A_758 {
    private static void equality(int []a){
        Arrays.sort(a);
        int temp=a[a.length-1],sum=0;
        for (int i = 0; i < a.length; i++) {
            sum += temp-a[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        equality(a);
    }
}
