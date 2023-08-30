package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class SublistReverse {

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

    private static Node reverseSubList(Node head, int left, int right) {
        Node curr = head, prev = null;
        int i;
        for (i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        Node rightTail = curr;
        Node rightHead = null;
        while (i <= right) {
            Node next = curr.next;
            curr.next = rightHead;
            rightHead = curr;
            curr = next;
            i++;
        }
        if (prev != null)
            prev.next = rightHead;
        else
            head = rightHead;
        rightTail.next = curr;
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
        for (int i = 0; i < n; i++)
            head = addLast(head, scanner.nextInt());
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        if (left < right && right <= n && head != null)
            head = reverseSubList(head, left, right);
        printAll(head);
    }

}
