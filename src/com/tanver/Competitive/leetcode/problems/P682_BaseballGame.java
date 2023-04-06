package com.tanver.Competitive.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class P682_BaseballGame {

    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (String operation : operations) {
            switch (operation) {
                case "C" -> {
                    if (!list.isEmpty())
                        list.remove(--count);
                }
                case "D" -> {
                    if (!list.isEmpty()) {
                        list.add(2 * list.get(count - 1));
                        ++count;
                    }
                }
                case "+" -> {
                    if (count > 1) {
                        list.add(list.get(count - 2) + list.get(count - 1));
                        ++count;
                    } else if (list.size() == 1) {
                        list.add(count - 1);
                        ++count;
                    }
                }
                default -> {
                    int temp = Integer.parseInt(operation);
                    list.add(temp);
                    ++count;
                }
            }
        }
        for (int temp : list)
            sum += temp;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new P682_BaseballGame().calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(new P682_BaseballGame().calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println(new P682_BaseballGame().calPoints(new String[]{"C", "1", "C"}));
        System.out.println(new P682_BaseballGame().calPoints(new String[]{"1", "D", "D", "D"}));
    }

}
