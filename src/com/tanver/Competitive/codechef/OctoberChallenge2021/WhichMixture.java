package com.tanver.Competitive.codechef.OctoberChallenge2021;

import java.util.Scanner;

public class WhichMixture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int solid = scanner.nextInt();
            int liquid = scanner.nextInt();
            if (solid > 0 && liquid > 0)
                System.out.println("Solution");
            else if (liquid == 0)
                System.out.println("Solid");
            else if (solid == 0)
                System.out.println("Liquid");
        }
    }
}
