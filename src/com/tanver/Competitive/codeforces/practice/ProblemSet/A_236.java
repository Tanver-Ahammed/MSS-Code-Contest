package com.tanver.Competitive.codeforces.practice.ProblemSet;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
import java.util.ArrayList;
import java.util.Scanner;

public class A_236 {
    private static int boyOrGirl(String st){
        ArrayList<Character>letter = new ArrayList<>();
        for (char ch : st.toCharArray()) {
            letter.add(ch);
        }
        int count=0;
        for (int i = 0; i < letter.size(); i++) {
            boolean flag = true;
            for (int j = i+1; j < letter.size(); j++) {
                if (letter.get(i)==letter.get(j)){
                    flag=false;
                    break;
                }
            }
            if (flag)
                count++;
        }
        return count;
    }
    private static void display(String st){
        int answer = boyOrGirl(st);
        if (answer%2==1)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        display(st);
    }
}
