package com.tanver.Competitive.leetcode.problems;

public class P657_RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int left = 0;
        int right = 0;
        int up = 0;
        int down = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') ++left;
            else if (ch == 'R') ++right;
            else if (ch == 'U') ++up;
            else ++down;
        }
        return left == right && up == down;
    }

    public static void main(String[] args) {

    }

}
