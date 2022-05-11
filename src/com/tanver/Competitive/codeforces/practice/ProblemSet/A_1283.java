package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  A. Minutes Before the New Year
*/
import java.util.Scanner;

public class A_1283 {
    private static void detMinute(int hh,int mm){
        int h=0,m=0;
        if (mm>0){
            m=60-mm;
            hh++;
        }
        h=24-hh;
        System.out.println(h*60+m);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int hh,mm;
            hh = scanner.nextInt();
            mm = scanner.nextInt();
            detMinute(hh,mm);
        }
    }
}
