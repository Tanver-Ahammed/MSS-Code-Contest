package com.tanver.Competitive.interviewbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HotelBookingsPossible {

    static class Pair {
        int data;
        boolean isArrive;

        public Pair(int data, boolean isArrive) {
            this.data = data;
            this.isArrive = isArrive;
        }
    }

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int n = 2 * arrive.size();
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < arrive.size(); i++) {
            pairs[i] = new Pair(arrive.get(i), true);
            pairs[n - i - 1] = new Pair(depart.get(i), false);
        }
        Arrays.sort(pairs, Comparator.comparingInt(p -> p.data));
        int counter = 0;
        for (Pair pair : pairs) {
            if (pair.isArrive)
                ++counter;
            else
                --counter;
            if (counter > K)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new HotelBookingsPossible().hotel(new ArrayList<>(List.of(1, 3, 5)),
                new ArrayList<>(List.of(2, 6, 8)), 1));
    }

}
