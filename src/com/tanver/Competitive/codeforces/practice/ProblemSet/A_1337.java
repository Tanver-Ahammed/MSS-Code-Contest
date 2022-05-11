package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  1337 A. Ichihime and Triangle
*/
import java.util.Scanner;

public class A_1337 {
    private static void detTriangle(int a,int b,int c,int d){
        int x=a,y=b,z=c;
        if (a!=b)
            x=a+1;
        if (b!=c)
            y=b+1;
        if (c!=d)
            z=c+1;

        System.out.println(x+" "+y+" "+z);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int a,b,c,d;
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            detTriangle(a,b,c,d);
        }
    }
}
