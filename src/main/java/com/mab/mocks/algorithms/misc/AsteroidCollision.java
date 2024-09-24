package com.mab.mocks.algorithms.misc;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Leecode 735. Asteroid Collision
 *
 * We are given an array asteroids of integers representing asteroids in a row.
 * For each asteroid, the absolute value represents its size, and the sign represents its direction
 * (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
 * Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
 * If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
 *
 * Example 1:
 * Input: asteroids = [5,10,-5]
 * Output: [5,10]
 * Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
 *
 *  Example 2:
 * Input: asteroids = [8,-8]
 * Output: []
 * Explanation: The 8 and -8 collide exploding each other.
 *
 *  Example 3:
 * Input: asteroids = [10,2,-5]sdl
 * Output: [10]
 * Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
 *
 * Constraints:
 * 2 <= asteroids.length <= 104
 * -1000 <= asteroids[i] <= 1000
 * asteroids[i] != 0
 */
public class AsteroidCollision {

    int[] getSurvivorAsteroids(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        //iterate over all asteroids
        for (int a : asteroids) {
            // if the asteroid value is positive adds it to the stack
            if (a > 0) {
                stack.push(a);
            } else {
                // while the stack has values, verify if the coming value is negative, if true destroys the existing
                // asteroid at the top of the stack
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(a)) {
                    stack.pop();
                }
                // if the top value from the stack is negative, gets added to teh stack.
                if(stack.peek() < 0) {
                    stack.push(a);
                } // if the coming asteroid and the one in the top of the stack are the same: both collide.
                else if (stack.peek() == Math.abs(a)) {
                    stack.pop();
                }
            }

            //get values from the stack to an int[]. reversed

        }



        return null;
    }

}
