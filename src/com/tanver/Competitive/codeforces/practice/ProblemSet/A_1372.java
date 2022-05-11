package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
problem    :  1372 A. Omkar and Completion
*/
import java.util.Scanner;

public class A_1372 {
    private static void omkarComplement(int numberOfArr) {
        for (int i = 0, number = 1; i < numberOfArr-1; i++) {
            number=2*number+1;
            if (number>1000)
                number=1;
            System.out.print(number+" ");
        }
        System.out.println(1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-->0){
            int numberOfArr = scanner.nextInt();
            omkarComplement(numberOfArr);
        }
    }
}
