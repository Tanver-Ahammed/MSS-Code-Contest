package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P949_LargestTimeForGivenDigits {

    public String largestTimeFromDigits(int[] arr) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int j : arr) list.add(j);

        int digit = 0;
        // 1st digit
        for (digit = 2; digit >= 0; digit--) {
            boolean flag = list.remove(Integer.valueOf(digit));
            if (flag)
                sb.append(digit);
            if (flag)
                break;
        }
        if (digit == 0 || digit == 1)
            digit = 9;
        else
            digit = 3;
        // 2nd digit
        for (int i = digit; i >= 0; i--) {
            boolean flag = list.remove(Integer.valueOf(i));
            if (flag)
                sb.append(i);
            if (flag)
                break;
        }
        sb.append(":");
        // 3rd digit
        for (int i = 5; i >= 0; i--) {
            boolean flag = list.remove(Integer.valueOf(i));
            if (flag)
                sb.append(i);
            if (flag)
                break;
        }
        // 4th digit
        sb.append(list.get(0));
        list.remove(0);

        return list.size() == 0 ? sb.toString() : "";
    }

    public static void main(String[] args) {
        System.out.println(new P949_LargestTimeForGivenDigits().
                largestTimeFromDigits(new int[]{2, 0, 6, 6}));
    }

}
