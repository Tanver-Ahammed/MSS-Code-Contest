package com.tanver.Competitive.codechef.numbersQuest;

import java.util.Scanner;

public class CHOCO_PRIME {
    private static boolean isPalindrome(int num) {
        StringBuffer sb = new StringBuffer();
        sb.append(num);
        String st2, st1;
        st1 = String.valueOf(num);
        st2 = sb.reverse().toString();
        return st1.equals(st2);
    }
    private static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
    private static void display(int num){
        if (!isPalindrome(num))
            System.out.println("No");
        else {
            if (!isPrime(num))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-->0){
            int num = scanner.nextInt();
            display(num);
        }
    }
}
