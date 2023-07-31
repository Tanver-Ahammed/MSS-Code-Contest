package com.tanver.Competitive.workat.arrays;

import java.util.ArrayList;
import java.util.List;

public class PositiveCumulativeSum {

    List<Integer> getPositiveCumulativeSum(int[] arr) {
        // add your logic here
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++)
                arr[i] = arr[i - 1] + arr[i];
        }
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0)
                results.add(arr[i]);
        return results;
    }

    public static void main(String[] args) {

    }

}
