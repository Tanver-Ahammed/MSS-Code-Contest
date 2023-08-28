package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class DeleteKthElementFromEnd {

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

    private static Node deleteFromKthNodeFromEnd(Node head, int k) {
        Node fast = head, slow = head;
        for (int i = 0; i < k; i++)
            fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    private static void printAll(Node head) {
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
        head = deleteFromKthNodeFromEnd(head, k);
        printAll(head);

    }

}
