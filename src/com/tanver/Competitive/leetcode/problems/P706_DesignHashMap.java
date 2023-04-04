package com.tanver.Competitive.leetcode.problems;

import java.util.Arrays;

class MyHashMap {

    int[] hashMap;

    public MyHashMap() {
        hashMap = new int[1000001];
        Arrays.fill(hashMap, -1);
    }

    public void put(int key, int value) {
        this.hashMap[key] = value;
    }

    public int get(int key) {
        return hashMap[key];
    }

    public void remove(int key) {
        this.hashMap[key] = -1;
    }
}

public class P706_DesignHashMap {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 54);
        hashMap.get(1);
        hashMap.remove(1);
    }

}
