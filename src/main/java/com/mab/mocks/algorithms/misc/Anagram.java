package com.mab.mocks.algorithms.misc;

import java.util.*;

/**
 * Anagram
 * Given 2 strings. determine if the 1st is an anagram of the 2nd, assume both strings are lowercase
 *
 * input: "anagram", "nagaram"
 * output: true
 *
 * Considerations:
 * they must have the same length
 * should be at least 1 character
 *
 * Solution:
 * Naive approach: Sort both strings and compare them to see if they are equal.
 * O(n) linear
 *
 ********************************
 * Second part:
 * Given an array of strings, group anagrams together.
 *
 * input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * output:
 * ["ate", "eat", "tea"]
 * ["nat", "tan"]
 * ["bat"]
 *
 * Solution:
 * Iterate over the array and sort the word.
 * aet
 * If it doesn't exist in a map add it as key and the value should be the original word.
 * "aet", ["ate"]
 *
 * If the key already exists, add it to the array:
 * "aet", ["ate", "tea"]
 */
public class Anagram {

    boolean isAnagram(String string1, String string2) {
        //validate edge cases
        if (string1.length() != string2.length()) {
            return false;
        }

        if (string1.length() == 1 && string2.length() == 1) {
            return string1.equals(string2);
        }

        if (string1.isEmpty() && string2.isEmpty()) {
            return false;
        }

        //convert strings to arrays
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();

        //sort arrays O(log n)
        Arrays.sort(array1);
        Arrays.sort(array2);

        // O(n) linear
        //main case
        for (int i = 0; i < array1.length; i++) {

            //if any character of the 2 arrays is different, return false. Otherwise, they are anagrams.
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    Collection<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : words) {
            //sorts the word to compare if exists or not in the map
            char[] sorted = word.toCharArray();
            Arrays.sort(sorted);
            String sortedWord = Arrays.toString(sorted);

            //creates a new arrayList if the word doesn't exist and adds it to it
            if (!anagrams.containsKey(sortedWord)) {
                List<String> anagram = new ArrayList<>();
                anagram.add(word);
                anagrams.put(sortedWord, anagram);

            } else {
                //if the string already exists in the list's map, adds a new entry to it.
                //TODO: Not a todo, just to highlight the most important part of the code here.
                // Here's the key to add a new value to the existent list inside the map
                anagrams.get(sortedWord).add(word);
            }
        }
        return anagrams.values();
    }
}
