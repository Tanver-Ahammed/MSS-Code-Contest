package com.tanver.Competitive.ostad.app.backtracking;

import java.util.Scanner;

public class AssignmentOnBacktracking {

    public static boolean isPath(int[][] maze) {
        int N = maze.length;
        boolean[][] visited = new boolean[N][N];
        return isPathHelper(maze, 0, 0, visited);
    }


    private static boolean isPathHelper(int[][] maze, int row, int col, boolean[][] visited) {
        int N = maze.length;

        if (row < 0 || row >= N || col < 0 || col >= N || maze[row][col] == 0 || visited[row][col]) {
            return false;
        }

        if (row == N - 1 && col == N - 1) {
            return true;
        }

        visited[row][col] = true;

        if (isPathHelper(maze, row + 1, col, visited) ||
                isPathHelper(maze, row - 1, col, visited) ||
                isPathHelper(maze, row, col + 1, visited) ||
                isPathHelper(maze, row, col - 1, visited)) {
            return true;
        }

        visited[row][col] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        System.out.println(isPath(maze));
    }

}
