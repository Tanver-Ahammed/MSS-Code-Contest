package com.tanver.Competitive.hackerrank.practice.datastructures.arrays;

import java.util.List;

public class ArraysDS {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int len = a.size();
        for (int i = 0; i < len / 2; i++) {
            int temp = a.get(i);
            a.set(i, a.get(len - 1 - i));
            a.set(len - 1 - i, temp);
        }
        return a;
    }

    public static void main(String[] args) {

    }
}