package com.tanver.Competitive.workat.arrays;

import java.util.Arrays;

public class CumulativeSum {

    private int[] getCumulativeSum(int[] arr) {
        // add your logic here
        if (arr.length == 1)
            return arr;
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i - 1] + arr[i];
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CumulativeSum().getCumulativeSum(new int[]{1, 2, 3, 4, 5})));
    }

}
