package com.tanver.Competitive.gfg.practice;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int n = 4;
        long arr1[] = {10, 12};
        int m = 5;
        long arr2[] = {5, 18, 20};

        Solution solution = new Solution();
        Solution.merge(arr1, arr2, arr1.length, arr2.length);
    }
}

class Solution {
    public static void merge(long arr1[], long arr2[], int n, int m) {

        long[] arr = new long[n + m];
        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++, i++) {
            arr[i] = arr2[j];
        }

        Arrays.sort(arr);

        i = 0;
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        for (int j = 0; j < arr2.length; j++, i++) {
            arr2[j] = arr[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}