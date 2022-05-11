package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.Scanner;

public class A_271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        while (true){
            year=year+1;
            int a,b,c,d;
            a=year/1000;
            b=year/100%10;
            c=year/10%10;
            d=year%10;
            if (a != b && a != c && a != d && b != c && b != d && c != d){
                System.out.println(year);
                break;
            }
        }
    }
}
