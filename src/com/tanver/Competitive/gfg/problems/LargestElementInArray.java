package com.tanver.Competitive.gfg.problems;

import java.util.Arrays;

public class LargestElementInArray {

    public int largest(int arr[], int n) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        LargestElementInArray obj = new LargestElementInArray();
        System.out.println(obj.largest(new int[]{1, 8, 7, 56, 90}, 5));
    }
}
