package com.tanver.study.master.dsa.stack.queue;

import java.util.Scanner;

public class StackUsingLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node top;
    private Node bottom;
    private int total;

    public StackUsingLinkedList() {
        this.top = null;
        this.bottom = null;
        this.total = 0;
    }

    private int peek() {
        if (this.top == null)
            return Integer.MIN_VALUE;
        return this.top.value;
    }

    private boolean push(int value) {
        Node newNode = new Node(value);
        if (this.total == 0) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            Node holdingPointer = this.top;
            this.top = newNode;
            this.top.next = holdingPointer;
        }
        ++this.total;
        return true;
    }

    private int pop() {
        if (this.top == null)
            return Integer.MIN_VALUE;
        if (this.top == this.bottom) {
            this.bottom = null;
        }
        int popValue = this.top.value;
        this.top = this.top.next;
        --this.total;
        return popValue;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackUsingLinkedList stack = new StackUsingLinkedList();
        System.out.println("Enter Your Choice: \n1. push\n2. pop\n3. peek\n4. total");
        while (true) {
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    int pushValue = scanner.nextInt();
                    System.out.println(stack.push(pushValue));
                    break;
                case "2":
                    System.out.println(stack.pop());
                    break;
                case "3":
                    System.out.println(stack.peek());
                    break;
                case "4":
                    System.out.println(stack.getTotal());
                    break;
                default:
                    System.err.println("Wrong Choice!!!");
            }
        }


    }

}
