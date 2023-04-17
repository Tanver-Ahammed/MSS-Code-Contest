package com.tanver.study.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public void bfs(LinkedList<Integer>[] adjacency, int source) {
        List<Integer> bfsList = new ArrayList<>();
        boolean[] isVisitedNode = new boolean[adjacency.length];
        int[] parentNode = new int[adjacency.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        isVisitedNode[source] = true;
        parentNode[source] = -1;
        while (!queue.isEmpty()) {
            int poll = queue.poll();
            bfsList.add(poll);
            for (int i : adjacency[poll]) {
                if (!isVisitedNode[i]) {
                    isVisitedNode[i] = true;
                    queue.add(i);
                    parentNode[i] = poll;
                }
            }
        }
        System.out.println("BFS List: " + bfsList);
    }

}
