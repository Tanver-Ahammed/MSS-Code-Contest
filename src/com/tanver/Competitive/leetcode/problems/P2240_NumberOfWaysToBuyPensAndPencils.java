package com.tanver.Competitive.leetcode.problems;

public class P2240_NumberOfWaysToBuyPensAndPencils {

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long way = 0;
        for (int i = 0; ; i++) {
            int totCost1 = i * cost1;
            if (totCost1 > total)
                break;
            int totCost2 = total - totCost1;
            int temp = totCost2 / cost2 + 1;
            way += temp;
        }
        return way;
    }

    public static void main(String[] args) {
        System.out.println(new P2240_NumberOfWaysToBuyPensAndPencils().waysToBuyPensPencils(5, 10, 10));
    }

}
