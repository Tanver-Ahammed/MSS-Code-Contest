package com.tanver.Competitive.leetcode.problems;


import java.util.ArrayList;
import java.util.List;

class MyQueue {

    List<Integer> queue;

    public MyQueue() {
        queue = new ArrayList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return queue.remove(queue.size() - 1);
    }

    public int peek() {
        return queue.get(queue.size() - 1);
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

public class P232_ImplementQueueUsingStacks {

    public static void main(String[] args) {

    }

}
