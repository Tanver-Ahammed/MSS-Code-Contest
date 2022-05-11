package com.tanver.Competitive.hackerrank.practice.other;

import java.util.Scanner;

public class Day4_ClassVsInstance {
    private int age;

    public Day4_ClassVsInstance(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else
            this.age = initialAge;
    }

    public void amIOld() {
        if (this.age < 13)
            System.out.println("You are young.");
        else if (this.age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
        // Write code determining if this person's age is old and print the correct statement:
    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day4_ClassVsInstance p = new Day4_ClassVsInstance(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}