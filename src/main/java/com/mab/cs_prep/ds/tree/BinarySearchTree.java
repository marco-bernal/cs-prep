package com.mab.cs_prep.ds.tree;

/**
 * Binary Search Tree implementation.
 * Important. It must contain at max 2 child nodes, can be 0 1 or 2. but no more than that.
 * Otherwise, one would be referring to a Non-Binary tree. Which can have more than 2 child nodes.
 *
 * Traversing a Binary Search Tree:
 * Always if the value is smaller than the Node moves to the left. Otherwise, moves to the right.
 */
public class BinarySearchTree {

    private Node root;

    /**
     * Inserts a new Node in a Binary Search Tree. By traversing the tree and verifying where should it be placed.
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
     * Finds the min value of the Binary Search Tree.
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
     * Finds the max value of the Binary Search Tree.
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

    //TODO: Finish this Implementation. Research how to  do it.
    public void printTree() {

        Node leftParent;
        Node leftCurrent;
        Node rightParent;
        Node rightCurrent;

        //validate if root doesn't have children, and just print it
        if (root.getLeftChild() == null && root.getRightChild() == null) {
            System.out.println(root.getKey());
        }
        else { // root has children

            leftParent = root;
            rightParent = root;
            leftCurrent = leftParent;
            rightCurrent = rightParent;

            //prints the root value
            System.out.println(root.getKey());

            while (true) {

                if (rightCurrent.getRightChild() != null) {
                    rightParent = rightCurrent;
                    rightCurrent = rightParent.getRightChild();

                    System.out.println(rightCurrent.getKey());
                }

                if(rightCurrent.getLeftChild() != null) {
                    leftParent = rightCurrent;
                    leftCurrent = leftParent.getLeftChild();

                    System.out.println(leftCurrent.getKey());
                }
                

            }

        }
    }
}