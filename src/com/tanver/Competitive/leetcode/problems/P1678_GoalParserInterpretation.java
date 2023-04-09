package com.tanver.Competitive.leetcode.problems;

public class P1678_GoalParserInterpretation {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < command.length()) {
            if (command.charAt(index) == 'G') {
                result.append(command.charAt(index));
                ++index;
            } else if (command.substring(index, index + 2).equals("()")) {
                result.append('o');
                index += 2;
            } else {
                result.append("al");
                index += 4;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new P1678_GoalParserInterpretation().interpret("G()()()()(al)"));
    }

}
