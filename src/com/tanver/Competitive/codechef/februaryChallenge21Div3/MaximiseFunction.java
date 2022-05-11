package com.tanver.Competitive.codechef.februaryChallenge21Div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximiseFunction {
    private static void modulusSum(ArrayList<Long> numbers) {
        Collections.sort(numbers);
        Long sum = Long.valueOf(0);
        sum = numbers.get(numbers.size() - 1) - numbers.get(0);
        System.out.println(2 * sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer testCase = scanner.nextInt();
        while (testCase-- > 0) {
            Integer n = scanner.nextInt();
            ArrayList<Long> numbers = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                numbers.add(scanner.nextLong());
            }
            modulusSum(numbers);
        }
    }
}
