package com.mab.cs_prep.algorithms.misc;

//TODO: Add problem explanation, input, output. Explain solution approaches.
public class ReverseString {

    String reverseString(String string) {
        StringBuilder reversed = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }
}
