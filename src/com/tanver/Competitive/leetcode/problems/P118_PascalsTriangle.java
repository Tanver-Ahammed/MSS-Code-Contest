package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> newList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(0, 1);
            if (i > 1) {
                List<Integer> previousList = newList.get(i - 1);
                for (int j = 1; j < previousList.size(); j++) {
                    temp.add(j, previousList.get(j - 1) + previousList.get(j));
                }
            }
            if (i != 0)
                temp.add(i, 1);
            newList.add(temp);
        }
        return newList;
    }

    public static void main(String[] args) {

    }

}
