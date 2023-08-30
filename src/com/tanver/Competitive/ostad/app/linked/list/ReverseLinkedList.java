package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class ReverseLinkedList {

    static class Node {
        int value;
        Node next;

        Node(int value) {
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

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private static void printAll(Node head) {
        if (head == null) {
            System.out.println();
            return;
        }
        Node currentNode = head;
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
        for (int i = 0; i < n; i++) {
            head = addLast(head, scanner.nextInt());
        }
        head = reverseLinkedList(head);
        printAll(head);
    }

}
