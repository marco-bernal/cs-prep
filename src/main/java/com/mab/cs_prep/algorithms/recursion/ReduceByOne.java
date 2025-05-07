package com.mab.cs_prep.algorithms.recursion;

/**
 * Recursion behaves as a stack: last in, first out (LIFO).
 *
 * Problem: reduceByOne(5).
 * Prints out:
 * Number: 0
 * Number: 1
 * Number: 2
 * Number: 3
 * Number: 4
 * Number: 5
 */
public class ReduceByOne {

    public void reduceByOne(int number) {
        //base case: //if the number is 0 or lower, returns 0.
        if (number > 0 ) {
            //recursive case
            reduceByOne(number - 1);
        }

        //prints out the value of number in a LIFO
        System.out.println("Number: " + number);
    }
}
