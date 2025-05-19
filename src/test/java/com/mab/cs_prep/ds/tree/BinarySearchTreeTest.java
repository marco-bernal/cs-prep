package com.mab.cs_prep.ds.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTreeTest {

    private BinarySearchTree binarySearchTree;

    @BeforeEach
    void setUp() {
        binarySearchTree = new BinarySearchTree();
    }

    @Test
    void shouldFindMaxValue() {
        //when
        binarySearchTree.insert(10, "Ten");
        binarySearchTree.insert(25, "TwentyFive");
        binarySearchTree.insert(15, "Fifteen");

        Node result = binarySearchTree.findMaxValue();

        //then
        assertThat(result.getKey()).isEqualTo(25);
    }

    @Test
    void shouldFindMinValue() {
        //when
        binarySearchTree.insert(10, "Ten");
        binarySearchTree.insert(25, "TwentyFive");
        binarySearchTree.insert(15, "Fifteen");

        Node result = binarySearchTree.findMinValue();

        //then
        assertThat(result.getKey()).isEqualTo(10);
    }
}