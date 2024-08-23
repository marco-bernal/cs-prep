package com.mab.mocks.ca;

public class ParenthesisValidator {

/**
 *
 * Class to verify whether a given string has matching parenthesis.
 *
 * Use these entries in the test file:
 * System.out.println(check("([)]"));                       // False
 * System.out.println(check("([(([[(([]))]]))])"));         // True
 * System.out.println(check("[(()])"));                     // False
 * System.out.println(check("[](()()[[]])()[]([])"));       // Might be true, but not sure.
 *
 * TODO: Explain solution approaches. Enhance with for each loops / streams if possible.
 */

    /**
     * Validates whether a string contains matching parenthesis or not.
     *
     * @param str String to check.
     * @return true or false.
     */
    static boolean check(String str) {
    //empty string
        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }

            }
        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (str.isEmpty());
    }
}
