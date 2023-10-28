package com.tanver.Competitive.ostad.app.graph;

import java.util.ArrayList;
import java.util.List;

public class AssignmentOnGraph2 {

    public int countPaths(int[] A, int[][] B, int C) {
        int n = A.length;
        List<List<Integer>> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<>());
        }
        for (int[] edge : B) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;
            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        return dfs(tree, A, C, 0, -1);
    }

    private int dfs(List<List<Integer>> tree, int[] A, int C, int node, int parent) {
        if (A[node] == 1) {
            C--;
        }

        int pathsWithAtMostCNodes = 0;

        if (C < 0) {
            return 0;
        }

        boolean isLeaf = true;

        for (int child : tree.get(node)) {
            if (child != parent) {
                isLeaf = false;
                pathsWithAtMostCNodes += dfs(tree, A, C, child, node);
            }
        }

        if (isLeaf) {
            pathsWithAtMostCNodes = 1;
        }

        if (A[node] == 1) {
            C++;
        }

        return pathsWithAtMostCNodes;
    }

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1, 1};
        int[][] B = {{1, 2}, {1, 5}, {1, 6}, {2, 3}, {2, 4}};
        int C = 1;

        AssignmentOnGraph2 solution = new AssignmentOnGraph2();
        int result = solution.countPaths(A, B, C);

        System.out.println("Output: " + result); // Expected output: 3
    }
}