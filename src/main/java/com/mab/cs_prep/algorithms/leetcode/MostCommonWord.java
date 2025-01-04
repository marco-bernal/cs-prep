package com.mab.cs_prep.algorithms.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 Leetcode 819. Most Common Word

 Given a string paragraph and a string array of the banned words banned,
 return the most frequent word that is not banned.
 It is guaranteed there is at least one word that is not banned, and that the answer is unique.
 The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 Example 1:
 Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 Output: "ball"

 Explanation:
 "hit" occurs 3 times, but it is a banned word.
 "ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.

 Note that words in the paragraph are not case-sensitive,
 that punctuation is ignored (even if adjacent to words, such as "ball,"),
 and that "hit" isn't the answer even though it occurs more because it is banned.

 Example 2:
 Input: paragraph = "a.", banned = []
 Output: "a"

 Constraints:
 1 <= paragraph.length <= 1000
 paragraph consists of English letters, space ' ', or one of the symbols: "!?',;.".
 0 <= banned.length <= 100
 1 <= banned[i].length <= 10
 banned[i] consists of only lowercase English letters.

 Solution:


 O(n)

 */
public class MostCommonWord {

    public String getMostCommonWord(String paragraph, String[] banned) {
        //Remove special characters and split paragraph into a lowercase string array
        String[] splitParagraph = paragraph.toLowerCase().split("[^a-zA-Z0-9]");

        //HashMap to store occurrences of words
        Map<String,Integer> words = new HashMap<>();

        //iterate over the array and store the word in a hashmap as key and a counter=1 as value
        for (String word : splitParagraph) {
            //validate if the word is banned and skip to the next one
            if (isBanned(word, banned)) {
                System.out.println(word + " is banned!");
                continue;
            }

            //validate if a key already exist. If so, increment the counter in 1. Else, add it.
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1);
            }
            else {
                words.put(word, 1);
            }
        }

        //extract the key that has the greatest counter
        return words.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    private boolean isBanned(String word, String[] banned) {
        for (String w : banned) {
            if (word.equals(w))
                return true;
        }
        return false;
    }
}
