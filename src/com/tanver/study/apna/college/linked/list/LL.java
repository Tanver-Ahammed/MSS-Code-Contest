package com.tanver.study.apna.college.linked.list;

public class LL {

    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert -> first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // print all
    public void printList() {
        Node currentNode = head;
        if (currentNode == null) {
            System.out.println("List is Empty...");
            return;
        }
        while (currentNode.next != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Bari");
        list.addFirst("Aminul");
        list.addFirst("Ahammed");
        list.addFirst("Tanver");
        list.addFirst("Md.");
        list.addLast(".");

        list.printList();
    }

}
