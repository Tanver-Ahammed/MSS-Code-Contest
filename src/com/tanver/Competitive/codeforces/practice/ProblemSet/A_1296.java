package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  1296 A. Array with Odd Sum
*/
import java.util.Scanner;

public class A_1296 {
    private static void oddSum(int []a){
        int even=0,odd=0,sum=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0)
                even++;
            else
                odd++;
            sum+=a[i];
        }
        if (sum%2==1||(even>0&&odd>0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            oddSum(a);
        }
    }
}
