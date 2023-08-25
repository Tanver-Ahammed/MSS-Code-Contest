package com.tanver.study.subeen.problems_52;

public class Prob_03_DescendingNumber {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1000; i >= 1; i--) {
            ++counter;
            if (counter == 5) {
                System.out.println(i + "\t");
                counter = 0;
            } else
                System.out.print(i + "\t");
        }
    }

}
