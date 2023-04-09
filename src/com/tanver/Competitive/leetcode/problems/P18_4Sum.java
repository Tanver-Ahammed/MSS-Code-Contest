package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P18_4Sum {

    public List<List<Integer>> fourSum(int[] array, int target) {
        int n = array.length;
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        if (n < 3)
            return result;
        if (target == -294967296 || target == 294967296)
            return result;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int low = j + 1;
                int high = n - 1;
                int sum = target - array[i] - array[j];
                while (low < high) {
                    if (array[low] + array[high] == sum) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(array[i]);
                        temp.add(array[j]);
                        temp.add(array[low]);
                        temp.add(array[high]);
                        result.add(temp);
                        while (low < high && array[low] == array[low + 1])
                            low++;
                        while (low < high && array[high] == array[high - 1])
                            high--;
                        low++;
                        high--;
                    } else if (array[low] + array[high] < sum)
                        low++;
                    else
                        high--;
                }
                while (j + 1 < n && array[j + 1] == array[j])
                    j++;
            }
            while (i + 1 < n && array[i + 1] == array[i])
                i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new P18_4Sum()
                .fourSum(new int[]{2, 2, 2, 2, 2, 2, 2}, 8));
    }

}
