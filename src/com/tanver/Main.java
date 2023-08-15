package com.tanver;

import java.util.*;

public class Main {

    public int majorityElement(final List<Integer> A) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = A.size();
        for (int a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            int val = map.get(a);
            if (val > n / 2)
                return a;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 1, 1));
        System.out.println(new Main().majorityElement(list));
    }

}
