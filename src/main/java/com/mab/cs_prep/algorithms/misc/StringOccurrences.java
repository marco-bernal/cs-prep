package com.mab.cs_prep.algorithms.misc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Checks how many times a string appears in a given array queries.
 * Returns the number of occurrences for each string and 0 if not found.
 * e.g:
 *
 * input:
 * strings = ["ab", "ab", "abc"]
 * queries = ["ab", "abc", "bc"]
 *
 * output:
 * result = [2, 1, 0]
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */
public class StringOccurrences {

    int[] getOccurrencesBruteForce(String[] strings, String[] queries) {
        int[] result = new int[queries.length];

        //brute force approach: Exponential time space complexity (Quadratic O^2)
        for (int i=0; i < queries.length; i++) {
            int counter = 0;

            for (String string : strings) {
                if (string.equals(queries[i])) {
                    counter += 1;
                }
            }

            result[i] = counter;
        }
        return result;
    }

    // Linear space complexity, depends on the size of the input (On)
    int[] getOccurrencesImprovedSolution(String[] strings, String[] queries) {
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        // Adds the query string into a map, adds 0 as default value
        for (String query : queries) {
            occurrences.put(query, 0);
        }

        // Iterates the strings array and validates if contains the query value.
        // If true adds 1 to the occurrences
        for (String string : strings) {
            if (occurrences.containsKey(string)) {
                //TODO: Not a todo task. Here's the key to update the counter. Gets the value by key and adds 1
                occurrences.put(string, occurrences.get(string) + 1);
            }
        }

        return occurrences.values()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // Linear space complexity, depends on the size of the input (On)
    List<Integer> getOccurrencesOptimal(String[] strings, String[] queries) {
        Map<String, Integer> occurrences = new LinkedHashMap<>();

        // Adds the query string into a map, adds 0 as default value
        for (String query : queries) {
            occurrences.put(query, 0);
        }

        // Iterates the strings array and validates if contains the query value.
        // If true adds 1 to the occurrences
        for (String string : strings) {
            if (occurrences.containsKey(string)) {
                //TODO: Not a todo task. Here's the key to update the counter. Gets the value by key and adds 1
                occurrences.put(string, occurrences.get(string) + 1);
            }
        }

        // TODO: Not a todo. This approach using streams could work. but, there's a better way to do it by
        return new ArrayList<>(occurrences.values());
    }
}
