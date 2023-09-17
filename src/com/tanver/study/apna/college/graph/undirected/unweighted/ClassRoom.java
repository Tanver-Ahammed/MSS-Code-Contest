package com.tanver.study.apna.college.graph.undirected.unweighted;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {

    static class Edge {
        int source;
        int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++)
            graph[i] = new ArrayList<Edge>();
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertex = 4;
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        createGraph(graph);

        // print 2's neighbour
        for (int i = 0; i < graph[2].size(); i++) {
            System.out.print(graph[2].get(i).destination + " ");
        }

    }

}
