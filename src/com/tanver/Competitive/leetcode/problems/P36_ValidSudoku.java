package com.tanver.Competitive.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class P36_ValidSudoku {

    public boolean isValidSudoku1(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (
                            set.contains(number + "_R_" + i) ||
                                    set.contains(number + "_C_ " + j) ||
                                    set.contains(number + "_B_" + i / 3 + "_" + j / 3)) {
                        return false;
                    } else {
                        set.add(number + "_R_" + i);
                        set.add(number + "_C_ " + j);
                        set.add(number + "_B_" + i / 3 + "_" + j / 3);
                    }

            }
        }
        return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] used = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int idx = c - '1';
                    if (used[idx]) {
                        return false;
                    }
                    used[idx] = true;
                }
            }
        }

        // Check each column
        for (int j = 0; j < 9; j++) {
            boolean[] used = new boolean[9];
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c != '.') {
                    int idx = c - '1';
                    if (used[idx]) {
                        return false;
                    }
                    used[idx] = true;
                }
            }
        }

        // Check each 3 x 3 sub-box
        for (int k = 0; k < 9; k++) {
            boolean[] used = new boolean[9];
            for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
                for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {
                    char c = board[i][j];
                    if (c != '.') {
                        int idx = c - '1';
                        if (used[idx]) {
                            return false;
                        }
                        used[idx] = true;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P36_ValidSudoku().isValidSudoku1(new char[][]
                {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                }
        ));
    }
}
