package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class SortedLinkedList {

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

    private static boolean isSortedList(Node head) {
        Node currentNode = head.next;
        while (currentNode != null) {
            if (head.value > currentNode.value)
                return false;
            currentNode = currentNode.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            head = addLast(head, scanner.nextInt());
        }
        assert head != null;
        if (isSortedList(head))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

}
