package com.mab.cs_prep.algorithms.recursion;

/**
 * Recursion is a technique used to call a function by itself. Consists of a base case and a recursive case.
 * MUST have a base case that should end up the loop.
 * Otherwise, one might face StackOverflow errors.
 *
 * Problem: get The factorial of x.
 * When: x=5
 * Factorial: (x * x-1)
 *
 * getFactorial(5 * 4 * 3 * 2 * 1) 120
 *
 * */
class Factorial {

    int getFactorial(int number) {
        //base case
        if (number <= 0) {
            return 1;
        }//recursive case
        else {
            return number * getFactorial(number - 1);
        }
    }
}
