package com.mab.cs_prep.ds.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    void shouldFindMaxValue() {
        //when
        binaryTree.insert(10, "Ten");
        binaryTree.insert(25, "TwentyFive");
        binaryTree.insert(15, "Fifteen");

        Node result = binaryTree.findMaxValue();

        //then
        assertThat(result.getKey()).isEqualTo(25);
    }

    @Test
    void shouldFindMinValue() {
        //when
        binaryTree.insert(10, "Ten");
        binaryTree.insert(25, "TwentyFive");
        binaryTree.insert(15, "Fifteen");

        Node result = binaryTree.findMinValue();

        //then
        assertThat(result.getKey()).isEqualTo(10);
    }
}