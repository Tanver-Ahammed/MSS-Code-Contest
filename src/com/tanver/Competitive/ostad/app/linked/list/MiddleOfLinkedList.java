package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class MiddleOfLinkedList {

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

    private static Node findMiddleNode(Node head) {
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            head = addLast(head, scanner.nextInt());
        }
        head = findMiddleNode(head);
        System.out.println(head.value);

    }

}
