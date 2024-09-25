package com.mab.data_structures.tree;

import com.mab.model.Node;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

//TODO: Delete component, use normal class, add explanation and way to solve it
@Component
public class BinaryTree {

    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        //Parent
        if (isNull(current)) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);

        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);

        } else { //value already exists ???
            return current;
        }

        return current;
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (isNull(current)) {
            return false;
        }
        if (value == current.value) {
            return true;
        }

        return value < current.value ?
                containsNodeRecursive(current.left, value) :
                containsNodeRecursive(current.right, value);
    }
}
