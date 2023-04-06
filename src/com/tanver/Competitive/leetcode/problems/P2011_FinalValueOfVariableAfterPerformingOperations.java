package com.tanver.Competitive.leetcode.problems;

public class P2011_FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int counter = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X" -> ++counter;
                case "X++" -> counter++;
                case "--X" -> --counter;
                case "X--" -> counter--;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(new P2011_FinalValueOfVariableAfterPerformingOperations()
                .finalValueAfterOperations(new String[]{"--X", "X++", "X++"}));
    }

}
