package com.mab.cs_prep.ds.graph;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    @Getter
    private int vertices; //no. of vertices
    @Getter
    private int edges; //no. of edges

    private final Map<String, List<String>> adjacencyMap = new HashMap<>();

    /**
     * Creates a vertex and initializes its edges to an empty ArrayList<Integer>.
     *
     * @param key vertex value.
     */
    public void addVertex(String key) {
        adjacencyMap.put(key, new ArrayList<>());
        vertices++;
    }

    /**
     * Adds and edge between 2 vertices.
     *
     * @param key source value.
     * @param value destination value.
     */
    public void addEdge(String key, String value) {
        if (adjacencyMap.containsKey(key)) {
            adjacencyMap.get(key).add(value);
            edges++;
        }
    }

    /**
     * Retrieves the adjacent values of a given vertex.
     *
     * @param key vertex value.
     * @return adjacent values from a given vertex.
     */
    public List<String> getAdjacentValues(String key) {
        return adjacencyMap.get(key);
    }
}
