package com.mab.data_structures;

/**
 * Stack example, showcases how to implement a Stack data structure in java
 **/

//TODO: Add explanation and way to solve it
class Stack {

    //Inner class to represent the Stack
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    //Stack operations
    private Node top;


    boolean isEmpty() {
        return top == null;
    }

    int peek() {
        if (top != null) {
            return top.data;
        }

        throw new NullPointerException("Stack doesn't contain any element");
    }

    int push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
        return top.data;
    }

    //Last in Fist out
    int pop() {
        if (top != null) {
            int data = top.data;
            top = top.next;
            return data;
        }

        throw new NullPointerException("Stack doesn't contain any element");
    }
}