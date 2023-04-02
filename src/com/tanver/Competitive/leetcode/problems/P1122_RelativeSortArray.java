package com.tanver.Competitive.leetcode.problems;

import java.util.*;

public class P1122_RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int index = 0;
        for (int num : arr2) {
            int temp = map.get(num) + index;
            while (index < temp) {
                arr1[index] = num;
                ++index;
            }
            map.remove(num);
        }
        List<Integer> list = new ArrayList<>();
        for (int key : map.keySet()) {
            int value = map.get(key);
            for (int i = 0; i < value; i++)
                list.add(key);
        }
        Collections.sort(list);
        for (int i = index; i < arr1.length; i++)
            arr1[i] = list.get(i - index);
        return arr1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new P1122_RelativeSortArray().relativeSortArray(
                new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6}
        )));
    }

}
