package com.mab.model;

/**
 * Auxiliary class for representing a node in a tree
 */
public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
