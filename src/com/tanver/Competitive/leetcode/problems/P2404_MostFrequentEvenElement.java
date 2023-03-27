package com.tanver.Competitive.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class P2404_MostFrequentEvenElement {

    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int output = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                int frequency = map.getOrDefault(num, 0) + 1;
                map.put(num, frequency);
                if (frequency > max) {
                    max = frequency;
                    output = num;
                } else if (frequency == max && output > num) {
                    output = num;
                }
            }
        }
        return output;
    }

    public int mostFrequentEven2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int frequency = 0, output = -1, current = 0;
        for (int value : nums) {
            if (value % 2 == 1) continue;
            current = map.getOrDefault(value, 0) + 1;
            map.put(value, current);
            if (current > frequency || current == frequency && value < output) {
                frequency = current;
                output = value;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(new
                P2404_MostFrequentEvenElement()
                .mostFrequentEven(new int[]{
                        8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290
//                        0, 1, 2, 2, 4, 4, 1
//                        4, 4, 4, 9, 2, 4
                }));
    }

}
