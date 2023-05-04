package com.tanver.Competitive.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int repeat = 0;
        int miss = 0;
        int[] arr = new int[A.size() + 1];
        for (Integer val : A)
            arr[val]++;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2)
                repeat = i;
            if (arr[i] == 0)
                miss = i;
        }
        return new ArrayList<>(List.of(repeat, miss));
    }

    public static void main(String[] args) {
        System.out.println(new RepeatAndMissingNumberArray().repeatedNumber(
                List.of(3, 1, 2, 5, 3)
        ));
    }

}
