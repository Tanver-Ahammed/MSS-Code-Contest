package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class TheTimeInWords {
    public static void main(String[] args) {

        String[] numberWords = new String[]{
                "",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine",
                "ten",
                "eleven",
                "twelve",
                "thirteen",
                "fourteen",
                "fifteen",
                "sixteen",
                "seventeen",
                "eighteen",
                "nineteen",
                "twenty",
                "twenty one",
                "twenty two",
                "twenty three",
                "twenty four",
                "twenty five",
                "twenty six",
                "twenty seven",
                "twenty eight",
                "twenty nine"
        };

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute == 0)
            System.out.println(numberWords[hour] + " o' clock");
        else if (minute == 15)
            System.out.println("quarter past " + numberWords[hour]);
        else if (minute == 30)
            System.out.println("half past " + numberWords[hour]);
        else if (minute == 45)
            System.out.println("quarter to " + numberWords[hour % 12 + 1]);
        else if (minute < 30) {
            if (minute == 1)
                System.out.println(numberWords[minute] + " minute past " + numberWords[hour]);
            else
                System.out.println(numberWords[minute] + " minutes past " + numberWords[hour]);

        } else {
            if (60 - minute == 1)
                System.out.println(numberWords[60 - minute] + " minute to " + numberWords[hour % 12 + 1]);
            else
                System.out.println(numberWords[60 - minute] + " minutes to " + numberWords[hour % 12 + 1]);
        }
    }
}
