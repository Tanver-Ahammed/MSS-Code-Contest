package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,sum=0,result=0;
        n = scanner.nextInt();
        while (n-->0){
            Integer a,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum = sum-a+b;
            if (sum>result){
                result=sum;
            }
        }
        System.out.println(result);
    }
}
