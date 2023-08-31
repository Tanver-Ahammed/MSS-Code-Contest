package com.tanver.study.master.dsa.stack.queue;

import java.util.Scanner;

public class QueueUsingLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int total;

    public QueueUsingLinkedList() {
        this.first = null;
        this.last = null;
        this.total = 0;
    }

    private int peek() {
        if (this.first == null)
            return Integer.MIN_VALUE;
        return this.first.value;
    }

    private boolean enqueue(int value) {
        Node newNode = new Node(value);
        if (this.total == 0) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }
        this.last = newNode;
        ++this.total;
        return true;
    }

    private int dequeue() {
        if (this.first == null)
            return Integer.MIN_VALUE;
        if (this.first == this.last) {
            this.last = null;
        }
        int dequeueValue = this.first.value;
        this.first = this.first.next;
        --this.total;
        return dequeueValue;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        System.out.println("Enter Your Choice: \n1. enqueue\n2. dequeue\n3. peek\n4. total");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    int enqueueValue = scanner.nextInt();
                    System.out.println(queue.enqueue(enqueueValue));
                    break;
                case "2":
                    System.out.println(queue.dequeue());
                    break;
                case "3":
                    System.out.println(queue.peek());
                    break;
                case "4":
                    System.out.println(queue.getTotal());
                    break;
                default:
                    System.err.println("Wrong Choice!!!");
            }
        }
    }


}
