package com.tanver.Competitive.workat.arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberOfDigits {

    List<Integer> getEvenDigitNumbers(int[] arr) {
        // add your logic here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (digitCounter(arr[i]) % 2 == 0 && arr[i] != 0)
                result.add(arr[i]);
        }
        return result;
    }

    private int digitCounter(int num) {
        int counter = 0;
        while (num != 0) {
            num = num / 10;
            ++counter;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new EvenNumberOfDigits().getEvenDigitNumbers(new int[]{0, 02, 555, 90, 03, 65, 94}));
    }
}
