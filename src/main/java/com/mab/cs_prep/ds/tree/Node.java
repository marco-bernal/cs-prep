package com.mab.cs_prep.ds.tree;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Node {

    private int key;
    private String value;

    private Node leftChild;
    private Node rightChild;

    public Node(int key, String value) {
        this.key = key;
        this.value = value;
    }
}