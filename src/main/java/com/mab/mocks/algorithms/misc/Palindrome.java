package com.mab.mocks.algorithms.misc;

//TODO: Add problem explanation, input, output. Explain solution approaches.
public class Palindrome {

    //TODO: Add complexity for all solutions
    boolean isPalindrome(String value) {
        boolean result = false;

        for (int i = 0, j = value.length() - 1; i < value.length(); i++, j--) {
            if (value.charAt(i) == value.charAt(j)) {
                result = true;
            }
        }
        return result;
    }

    //is palindrome using recursion
    boolean isPalindromeRecursion(String value) {
        if (value.isEmpty() || value.length() == 1) {
            return true;
        }
        if (value.charAt(0) == value.charAt(value.length() - 1)) {
            return isPalindromeRecursion(value.substring(1, value.length() - 1));
        }
        return false;
    }

    //is palindrome more efficient solution
    boolean isPalindromeMoreEfficient(String value) {
        int i = 0, j = value.length() - 1;
        while (i < j) {
            if (value.charAt(i) != value.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}