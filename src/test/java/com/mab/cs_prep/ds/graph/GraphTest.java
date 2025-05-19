package com.mab.cs_prep.ds.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class GraphTest {

    private Graph graph;

    @BeforeEach
    void setUp() {
        graph = new Graph();
    }

    @Test
    void shouldCreateDirectionalGraph() {
        //when
        graph.addVertex("State");
        graph.addVertex("Aveline");
        graph.addVertex("Elm");
        graph.addVertex("Pocono");
        graph.addVertex("William");

        // State
        graph.addEdge("State", "Aveline");
        graph.addEdge("State", "Elm");
        // Aveline
        graph.addEdge("Aveline", "Pocono");
        // Elm
        graph.addEdge("Elm", "William");
        graph.addEdge("Elm", "Aveline");
        // Pocono
        graph.addEdge("Pocono", "Elm");
        // William
        graph.addEdge("William", "State");
        graph.addEdge("William", "Pocono");

        //then
        assertThat(graph.getAdjacentValues("State")).containsExactly("Aveline", "Elm");
        assertThat(graph.getAdjacentValues("Aveline")).containsExactly("Pocono");
        assertThat(graph.getAdjacentValues("Elm")).containsExactly("William", "Aveline");
        assertThat(graph.getAdjacentValues("Pocono")).containsExactly("Elm");
        assertThat(graph.getAdjacentValues("William")).containsExactly("State", "Pocono");
    }
}