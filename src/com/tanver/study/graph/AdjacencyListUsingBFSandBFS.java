package com.tanver.study.graph;

import java.util.*;

public class AdjacencyListUsingBFSandBFS {
    private static LinkedList<Integer>[] adjacency;

    public AdjacencyListUsingBFSandBFS(int vertices) {
        adjacency = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacency[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int source, int destination) {
        adjacency[source].add(destination);
        adjacency[destination].add(source);
        System.out.println(adjacency[destination]);
        System.out.println(adjacency[source]);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of VERTICES: ");
        int vertices = scanner.nextInt();
        System.out.print("Enter the number of EDGES: ");
        int edges = scanner.nextInt();
        AdjacencyListUsingBFSandBFS graph = new AdjacencyListUsingBFSandBFS(vertices);
        for (int i = 0; i < edges; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            graph.insertEdge(source, destination);
        }
        System.out.print("Enter Source for BFS & BFS Traversal: ");
        int source = scanner.nextInt();
        new BFS().bfs(adjacency, source);
        new DFS().dfs(adjacency, source);
    }

}
