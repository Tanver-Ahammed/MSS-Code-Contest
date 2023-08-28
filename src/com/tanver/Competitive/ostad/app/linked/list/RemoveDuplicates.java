package com.tanver.Competitive.ostad.app.linked.list;

import java.util.HashSet;
import java.util.Scanner;

class RemoveDuplicates {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
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

    private static void removeDuplicates(Node head) {
        if (head == null)
            return;

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.value)) {
                prev.next = current.next;
            } else {
                seen.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }

    private static void printList(Node head) {
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
        while (n-- > 0) {
            head = addLast(head, scanner.nextInt());
        }
        removeDuplicates(head);
        printList(head);
    }


}
