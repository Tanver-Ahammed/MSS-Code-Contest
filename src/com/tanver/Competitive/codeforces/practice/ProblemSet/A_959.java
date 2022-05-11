package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  959 A. Mahmoud and Ehab and the even-odd game
*/
import java.util.Scanner;

public class A_959 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n%2==0)
                System.out.println("Mahmoud");
            else
                System.out.println("Ehab");
        }
    }
}
