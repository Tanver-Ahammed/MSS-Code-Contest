package com.tanver.Competitive.leetcode.problems;

import java.util.List;

public class P1773_CountItemsMatchingARule {

    public int countMatches1(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) ++counter;
            else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) ++counter;
            else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) ++counter;
        }
        return counter;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index;
        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else index = 2;
        int counter = 0;
        for (List<String> l : items) {
            if (l.get(index).equals(ruleValue))
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {

    }

}
