package com.mab.cs_prep.ds.tree;

/**
 * Binary tree implementation.
 * Important. It must contain at max 2 child nodes, can be 0 1 or 2. but no more than that.
 * Otherwise, one would be referring to a Non-Binary tree. Which can have more than 2 child nodes.
 *
 * Traversing a Binary Tree:
 * Always if the value is smaller than the Node moves to the left. Otherwise, moves to the right.
 */
public class BinaryTree {

    private Node root;

    /**
     * Inserts a new Node in a Binary Tree. By traversing the tree and verifying where should it be placed.
     *
     * @param key New Node's key.
     * @param value New Node's value.
     */
    public void insert(int key, String value) {
        //New node created when inserting
        Node newNode = new Node(key, value);

        //First node created or Root node.
        if(root == null) {
            root = newNode;

        } else { //The tree already contains at least one node
            Node parent; // Parent of the current node
            Node current = root; // Current node in the tree

            while (true) {
                parent = current;

                //Moves current to the left
                if(key < current.getKey()) {
                    current = current.getLeftChild();

                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else { //Moves current to the right
                    current = current.getRightChild();

                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    /**
     * Finds the min value of the Binary Tree.
     * @return Node containing the min value.
     */
    public Node findMinValue() {
        Node current = root;
        Node last = null;

        //Moves to the left, till finds the leaf node (null).
        while (current != null) {
            last = current;
            current = current.getLeftChild();
        }
        return last;
    }

    /**
     * Finds the max value of the Binary Tree.
     * @return Node containing the max value.
     */
    public Node findMaxValue() {
        Node current = root;
        Node last = null;

        //Moves to the left, till finds the leaf node (null).
        while (current != null) {
            last = current;
            current = current.getRightChild();
        }
        return last;
    }
}
