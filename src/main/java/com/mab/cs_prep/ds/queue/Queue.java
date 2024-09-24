package com.mab.data_structures;

//TODO: Add tests, explanation and way to solve it
public class Queue {

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head; //remove elements from here
    private Node tail; //add elements here

    //add, remove and peek methods to implement
    int add(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        }

        if (tail != null) {
            tail.next = node;
        }

        tail = node;

        return tail.data;
    }

    int remove() {
        int data = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return data;
    }

    int peek() {
        if (head != null) {
            return head.data;
        }
        throw new NullPointerException("Queue is empty");
    }

    boolean isEmpty() {
        return head == null;
    }
}
