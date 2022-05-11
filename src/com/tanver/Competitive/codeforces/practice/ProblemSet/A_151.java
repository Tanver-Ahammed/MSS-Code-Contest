package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  A. Soft Drinking
*/
import java.util.Scanner;

public class A_151 {
    private static void softDrinking(int n,int drink,int limes,int salt){
        int min = (drink<limes)?drink:limes;
        int ans=(min<salt)?min:salt;
        System.out.println(ans/n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n, k, l, c, d, p, nl, np,totalDrink=0,totalLimes=0;
            n = scanner.nextInt();
            k = scanner.nextInt();
            l = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            p = scanner.nextInt();
            nl = scanner.nextInt();
            np = scanner.nextInt();
            totalDrink=k*l;
            totalLimes=c*d;
            softDrinking(n,totalDrink/nl,totalLimes,p/np);
        }
    }
}
