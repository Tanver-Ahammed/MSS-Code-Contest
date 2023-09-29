package com.tanver.Competitive.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    static class Pair {
        int time;
        boolean isStart;

        public Pair(int time, boolean isStart) {
            this.time = time;
            this.isStart = isStart;
        }
    }

    public int solve(ArrayList<ArrayList<Integer>> A) {
        if (A.isEmpty()) return 0;
        Pair[] meetings = new Pair[2 * A.size()];
        int index = 0;
        for (ArrayList<Integer> integers : A) {
            meetings[index++] = new Pair(integers.get(0), true);
            meetings[index++] = new Pair(integers.get(0), false);
        }
        Comparator<Pair> comparator = Comparator.comparingInt(p -> p.time);
        Arrays.sort(meetings, comparator);
        int maxRoom = 0, count = 0;
        for (Pair meeting : meetings) {
            if (meeting.isStart) ++count;
            else --count;
            maxRoom = Math.max(maxRoom, count);
        }
        return maxRoom;
    }


}
