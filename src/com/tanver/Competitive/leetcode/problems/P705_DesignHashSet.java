package com.tanver.Competitive.leetcode.problems;


class MyHashSet {

    boolean[] hash;

    public MyHashSet() {
        hash = new boolean[1000000 + 1];
    }

    public void add(int key) {
        hash[key] = true;
    }

    public void remove(int key) {
        hash[key] = false;
    }

    public boolean contains(int key) {
        return hash[key];
    }
}

public class P705_DesignHashSet {

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(54);
        hashSet.contains(54);
        hashSet.remove(54);
    }

}
