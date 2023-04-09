package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P2178_MaximumSplitOfPositiveEvenIntegers {

    public List<Long> maximumEvenSplit(long finalSum) {
        if (finalSum % 2 != 0)
            return new ArrayList<>();
        List<Long> list = new ArrayList<>();
        long divisor = 2;
        long sum = 0;
        while (sum + divisor <= finalSum) {
            sum += divisor;
            list.add(divisor);
            divisor += 2;
        }
        int len = list.size() - 1;
        list.set(len, finalSum - sum + list.get(len));
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new P2178_MaximumSplitOfPositiveEvenIntegers().maximumEvenSplit(8));
    }

}
