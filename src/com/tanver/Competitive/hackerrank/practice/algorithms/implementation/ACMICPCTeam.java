package com.tanver.Competitive.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[] attendPerson = new String[n];
        for (int i = 0; i < attendPerson.length; i++) {
            attendPerson[i] = scanner.next();
        }

        int maxAns = 0;
        int teams = 0;
        for (int i = 0; i < attendPerson.length - 1; i++) {
            for (int j = i + 1; j < attendPerson.length; j++) {
                int rightAns = 0;
                for (int k = 0; k < m; k++) {
                    if (attendPerson[i].charAt(k) == '1' || attendPerson[j].charAt(k) == '1') {
                        ++rightAns;
                    }
                }

                if (maxAns == rightAns) {
                    ++teams;
                }
                if (maxAns < rightAns) {
                    teams = 1;
                    maxAns = rightAns;
                }

            }
        }
        System.out.println(maxAns);
        System.out.println(teams);
    }
}
