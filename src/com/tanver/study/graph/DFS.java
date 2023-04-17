package com.tanver.study.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFS {

    public void dfs(LinkedList<Integer>[] adjacency, int source) {
        List<Integer> dfsList = new ArrayList<>();
        boolean[] isVisitedNode = new boolean[adjacency.length];
        int[] parentNode = new int[adjacency.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(source);
        isVisitedNode[source] = true;
        parentNode[source] = -1;
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            dfsList.add(pop);
            for (int i : adjacency[pop]) {
                if (!isVisitedNode[i]) {
                    isVisitedNode[i] = true;
                    stack.add(i);
                    parentNode[i] = pop;
                }
            }
        }
        System.out.println("DFS List: " + dfsList);
    }

}
