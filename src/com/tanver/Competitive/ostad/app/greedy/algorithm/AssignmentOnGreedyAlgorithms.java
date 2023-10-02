package com.tanver.Competitive.ostad.app.greedy.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AssignmentOnGreedyAlgorithms {

    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static int findMaxDisjointIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a.end));

        int count = 1;
        int endPoint = intervals[0].end;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start > endPoint) {
                count++;
                endPoint = intervals[i].end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Interval[] intervals = new Interval[n];
        for (int i = 0; i < n; i++) {
            intervals[i] = new Interval(scanner.nextInt(), scanner.nextInt());
        }
        System.out.println(findMaxDisjointIntervals(intervals));
    }
}
