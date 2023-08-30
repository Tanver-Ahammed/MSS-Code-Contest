package com.tanver.Competitive.ostad.app.linked.list;

import java.util.Scanner;

public class PalindromeLinkedList {

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

    private static Node findMiddle(Node head) {
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private static String isPalindrome(Node head) {
        if (head == null || head.next == null)
            return "YES";
        Node mid = findMiddle(head);
        Node secondHalf = reverseLinkedList(mid.next);
        Node firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.value != secondHalf.value) {
                return "NO";
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            head = addLast(head, scanner.nextInt());
        }
        System.out.println(isPalindrome(head));
    }

}
