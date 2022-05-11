package com.tanver.Competitive.atcoder.abc_188;

import java.util.ArrayList;
import java.util.Scanner;

public class B_Orthogonality {
    private static int detTheCalculation(ArrayList<Integer> listA, ArrayList<Integer> listB) {
        int sum = 0;
        for (int i = 0; i < listA.size(); i++) {
            sum += listA.get(i) * listB.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<Integer> listA = new ArrayList<>(n);
            ArrayList<Integer> listB = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                listA.add(scanner.nextInt());
            }
            for (int i = 0; i < n; i++) {
                listB.add(scanner.nextInt());
            }
            int temp = detTheCalculation(listA, listB);
            if (temp == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
