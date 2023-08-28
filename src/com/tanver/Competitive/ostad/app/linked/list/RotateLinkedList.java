package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class RotateLinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private static Node addLast(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null)
            return newNode;
        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = newNode;
        return head;
    }

    private static Node rotateList(Node head, int k) {
        Node currentNode = head;
        Node prev = head;
        int i = 0;
        while (currentNode.next != null) {
            if (++i == k) {
                head = currentNode.next;
            }
            currentNode = currentNode.next;
        }
        while (k-- > 0) {
            currentNode.next = prev;
            prev = prev.next;
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return head;
    }

    public static void printAll(Node head) {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("List is Empty...");
            return;
        }
        while (currentNode.next != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            head = addLast(head, scanner.nextInt());
        }
        head = rotateList(head, k);
        printAll(head);
    }

}
